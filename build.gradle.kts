import java.time.Year

plugins {
    java
    `maven-publish`
    id("fabric-loom") version "0.7-SNAPSHOT"
    id("org.cadixdev.licenser") version("0.6.1")
}

group = "io.github.pixelrocket"
version = "0.0.0"

repositories {
    mavenCentral()
}

dependencies {
    // Core
    minecraft("com.mojang:minecraft:1.16.5")
    mappings("net.fabricmc:yarn:1.16.5+build.10:v2")
    modImplementation("net.fabricmc:fabric-loader:0.11.6")

    // Libs
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.40.1+1.16")

    // Tests
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

java {
    withSourcesJar()
    withJavadocJar()

    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

license {
    setHeader(project.file("LICENSE_HEADER.txt"))
    include("**/*.java")
    include("**/*.gradle.kts")
    ext {
        set("year", Year.now().value)
        set("company", "Team Galacticraft")
    }
}

tasks.processResources {
    inputs.property("version", project.version)

    filesMatching("fabric.mod.json") {
        expand(mutableMapOf("version" to project.version))
    }

    // Minify json resources
    // https://stackoverflow.com/questions/41028030/gradle-minimize-json-resources-in-processresources#41029113
    doLast {
        fileTree(mapOf("dir" to outputs.files.asPath, "includes" to listOf("**/*.json", "**/*.mcmeta"))).forEach {
                file: File -> file.writeText(groovy.json.JsonOutput.toJson(groovy.json.JsonSlurper().parse(file)))
        }
    }
}

tasks.withType(JavaCompile::class) {
    dependsOn(tasks.checkLicenses)
    options.encoding = "UTF-8"
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            groupId = "io.github.pixelrocket"
            artifactId = "MoreEnchants"

            artifact(tasks.remapJar) { builtBy(tasks.remapJar) }
            artifact(tasks.getByName("sourcesJar", Jar::class)) { builtBy(tasks.remapSourcesJar) }
            artifact(tasks.getByName("javadocJar", Jar::class))
        }
    }

    repositories {
        maven("https://mvn.pyrrha.dev/") {
            name = "maven"
            credentials(PasswordCredentials::class)
            authentication {
                register("basic", BasicAuthentication::class)
            }
        }
    }
}