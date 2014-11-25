/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.logging;

import org.gradle.api.Incubating;

/**
 * Specifies how to treat color and dynamic console output.
 */
@Incubating
public enum ConsoleOutput {
    /**
     * Disable all color and dynamic output.
     */
    Disable,
    /**
     * Enable color and dynamic output when the current process is attached to a console, disable when not attached to a console.
     */
    Auto,
    /**
     * Enable color and dynamic output, regardless of whether the current process is attached to a console or not.
     * When not attached to a console, the color and dynamic output is encoded using ANSI control characters.
     */
    Enable
}