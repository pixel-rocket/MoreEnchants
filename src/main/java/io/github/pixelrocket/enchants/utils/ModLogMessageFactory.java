/*
 *   Copyright (c) 2021 Pixel Rocket
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.pixelrocket.enchants.utils;

import org.apache.logging.log4j.message.AbstractMessageFactory;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.logging.log4j.message.SimpleMessage;

public class ModLogMessageFactory extends AbstractMessageFactory {
    @Override
    public Message newMessage(CharSequence message) {
        return new SimpleMessage(Constants.LOG_PREFIX + message);
    }

    @Override
    public Message newMessage(Object object) {
        return new SimpleMessage(Constants.LOG_PREFIX + object);
    }

    @Override
    public Message newMessage(String message) {
        return new SimpleMessage(Constants.LOG_PREFIX + message);
    }

    @Override
    public Message newMessage(final String message, final Object... params) {
        return new ParameterizedMessage(Constants.LOG_PREFIX + message, params);
    }

    @Override
    public Message newMessage(final String message, final Object object) {
        return new ParameterizedMessage(Constants.LOG_PREFIX + message, object);
    }

    @Override
    public Message newMessage(final String message, final Object object, final Object object1) {
        return new ParameterizedMessage(Constants.LOG_PREFIX + message, object, object1);
    }

    @Override
    public Message newMessage(final String message, final Object object, final Object object1, final Object object2) {
        return new ParameterizedMessage(Constants.LOG_PREFIX + message, object, object1, object2);
    }

    @Override
    public Message newMessage(final String message, final Object object, final Object object1, final Object object2, final Object object3) {
        return new ParameterizedMessage(Constants.LOG_PREFIX + message, object, object1, object2, object3);
    }

    @Override
    public Message newMessage(final String message, final Object object, final Object object1, final Object object2, final Object object3, final Object object4) {
        return new ParameterizedMessage(Constants.LOG_PREFIX + message, object, object1, object2, object3, object4);
    }

    @Override
    public Message newMessage(final String message, final Object object, final Object object1, final Object object2, final Object object3, final Object object4, final Object object5) {
        return new ParameterizedMessage(Constants.LOG_PREFIX + message, object, object1, object2, object3, object4, object5);
    }

    @Override
    public Message newMessage(final String message, final Object object, final Object object1, final Object object2, final Object object3, final Object object4, final Object object5, final Object object6) {
        return new ParameterizedMessage(Constants.LOG_PREFIX + message, object, object1, object2, object3, object4, object5, object6);
    }

    @Override
    public Message newMessage(final String message, final Object object, final Object object1, final Object object2, final Object object3, final Object object4, final Object object5, final Object object6, final Object object7) {
        return new ParameterizedMessage(Constants.LOG_PREFIX + message, object, object1, object2, object3, object4, object5, object6, object7);
    }

    @Override
    public Message newMessage(final String message, final Object object, final Object object1, final Object object2, final Object object3, final Object object4, final Object object5, final Object object6, final Object object7, final Object object8) {
        return new ParameterizedMessage(Constants.LOG_PREFIX + message, object, object1, object2, object3, object4, object5, object6, object7, object8);
    }

    @Override
    public Message newMessage(final String message, final Object object, final Object object1, final Object object2, final Object object3, final Object object4, final Object object5, final Object object6, final Object object7, final Object object8, final Object object9) {
        return new ParameterizedMessage(Constants.LOG_PREFIX + message, object, object1, object2, object3, object4, object5, object6, object7, object8, object9);
    }
}
