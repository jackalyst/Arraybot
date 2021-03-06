package de.arraying.arraybot.util;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Role;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Copyright 2017 Arraying
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public final class URole {

    /**
     * The regular expression for a regular role ID.
     */
    private static final Pattern ID_PATTERN = Pattern.compile("^\\d{17,20}$");

    /**
     * The regular expression for a mention.
     */
    private static final Pattern MENTION_PATTERN = Pattern.compile("^<@&\\d{17,20}>$");

    /**
     * The regular expression for a role name.
     */
    private static final Pattern NAME_PATTERN = Pattern.compile("^.*$");

    /**
     * Gets the role corresponding to the given role input.
     * @param guild The guild.
     * @param input The input.
     * @return A Role object, or null if the input is invalid.
     */
    public static Role getRole(Guild guild, String input) {
        if(ID_PATTERN.matcher(input).find()
                || MENTION_PATTERN.matcher(input).find()) {
            return guild.getRoleById(input.replaceAll("\\D", ""));
        } else if(NAME_PATTERN.matcher(input).find()) {
            List<Role> roles = guild.getRolesByName(input, true);
            return roles.isEmpty() ? null : roles.get(0);
        } else {
            return null;
        }
    }

}
