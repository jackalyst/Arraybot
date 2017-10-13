package de.arraying.arraybot.util

/**
 * Copyright 2017 Arraying
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
enum class Limits(val limit: Int) {

    /**
     * The maximum ban reason length.
     */
    BAN_REASON(512),

    /**
     * The minimum channel name length.
     */
    CHANNEL_NAME_MIN(2),

    /**
     * The maximum channel name length.
     */
    CHANNEL_NAME_MAX(100),

    /**
     * The maximum channel topic length.
     */
    CHANNEL_TOPIC_MAX(1024),

    /**
     * The maximum amount of characters for the custom command name.
     */
    CUSTOM_NAME(100),

    /**
     * The maximum amount of characters for the custom command value.
     */
    CUSTOM_VALUE(1900),

    /**
     * The maximum displayable characters in a single embed field.
     */
    EMBED_FIELD(1024),

    /**
     * The maximum amount of characters for any message.
     */
    MESSAGE(2000),

    /**
     * The minimum nickname length.
     */
    NICKNAME_MIN(2),

    /**
     * The maximum nickname length.
     */
    NICKNAME_MAX(32);

    /**
     * Gets the limit as a string.
     */
    fun asString(): String {
        return limit.toString()
    }

}