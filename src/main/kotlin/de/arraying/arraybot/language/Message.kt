package de.arraying.arraybot.language

import de.arraying.arraybot.data.database.categories.GuildEntry
import de.arraying.arraybot.data.database.core.Category
import net.dv8tion.jda.core.entities.TextChannel
import net.dv8tion.jda.core.requests.RestAction

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
enum class Message(private val prefix: Boolean = false) {

    COMMAND_NAME_PROVIDE,
    COMMAND_NAME_INVALID,
    COMMAND_PERMISSION,
    COMMAND_UNAVAILABLE_DEVELOPER,
    COMMAND_UNAVAILABLE_EMBED,
    COMMAND_SUBCOMMAND_UNKNOWN,
    COMMANDS_COMMANDS_DISABLE_DEVELOPER,
    COMMANDS_COMMANDS_DISABLE_COMMANDS,
    COMMANDS_COMMANDS_DISABLE_DISABLED(true),
    COMMANDS_COMMANDS_EMBED_MAIN_DESCRIPTION,
    COMMANDS_COMMANDS_EMBED_MAIN_VALUE(true),
    COMMANDS_COMMANDS_INFO_ALIASES,
    COMMANDS_COMMANDS_INFO_CATEGORY,
    COMMANDS_COMMANDS_INFO_COMMANDDESCRIPTION,
    COMMANDS_COMMANDS_INFO_DESCRIPTION,
    COMMANDS_COMMANDS_INFO_HELP_TITLE,
    COMMANDS_COMMANDS_INFO_HELP_VALUE,
    COMMANDS_COMMANDS_INFO_NAME,
    COMMANDS_COMMANDS_INFO_PERMISSION,
    COMMANDS_COMMANDS_INFO_SYNTAX,
    COMMANDS_COMMANDS_INFO_TYPE,
    COMMANDS_COMMANDS_ENABLE(true),
    COMMANDS_COMMANDS_LIST_DESCRIPTION(true),
    COMMANDS_CUSTOM_CREATED,
    COMMANDS_CUSTOM_DELETED,
    COMMANDS_CUSTOM_DESCRIPTION,
    COMMANDS_CUSTOM_DESCRIPTION_LENGTH,
    COMMANDS_CUSTOM_EMBED_DESCRIPTION,
    COMMANDS_CUSTOM_EMBED_VALUE(true),
    COMMANDS_CUSTOM_EXISTS,
    COMMANDS_CUSTOM_LIST,
    COMMANDS_CUSTOM_NAME_LENGTH,
    COMMANDS_CUSTOM_NOT_EXISTS,
    COMMANDS_CUSTOM_PERMISSION_INVALID,
    COMMANDS_CUSTOM_PROVIDE_DESCRIPTION,
    COMMANDS_CUSTOM_PROVIDE_NAME,
    COMMANDS_CUSTOM_PROVIDE_PERMISSION,
    COMMANDS_CUSTOM_PROVIDE_SYNTAX,
    COMMANDS_CUSTOM_PROVIDE_TYPE,
    COMMANDS_CUSTOM_PROVIDE_VALUE,
    COMMANDS_CUSTOM_UPDATED,
    COMMANDS_CUSTOM_VALUE_LENGTH,
    COMMANDS_EVAL_CODE_PROVIDE,
    COMMANDS_EVAL_ENGINE_INVALID,
    COMMANDS_EVAL_ENGINE_PROVIDE,
    COMMANDS_EVAL_ERROR,
    COMMANDS_EVAL_EVALUATED,
    COMMANDS_HELP_EMBED_ANNOUNCEMENT,
    COMMANDS_HELP_EMBED_DESCRIPTION,
    COMMANDS_HELP_EMBED_HELP_TITLE,
    COMMANDS_HELP_EMBED_HELP_VALUE,
    COMMANDS_HELP_EMBED_START_TITLE,
    COMMANDS_HELP_EMBED_START_VALUE(true),
    COMMANDS_PING_PING,
    COMMANDS_RELOAD_APP,
    COMMANDS_RELOAD_EMBED_DESCRIPTION,
    COMMANDS_RELOAD_EMBED_VALUE(true),
    COMMANDS_RELOAD_INPUT_PROVIDE,
    COMMANDS_RELOAD_LANGUAGES_RELOADED,
    COMMANDS_RELOAD_MODE_PROVIDE,
    COMMANDS_RELOAD_SHARD_ERROR,
    COMMANDS_RELOAD_SHARD_INVALID,
    COMMANDS_RELOAD_SHARD_RELOADED,
    COMMANDS_SCRIPT_ERROR_LINK,
    COMMANDS_SCRIPT_EXECUTED,
    COMMANDS_SCRIPT_PROVIDE,
    COMMANDS_SHARDS_EMBED_DESCRIPTION(true),
    COMMANDS_SHARDS_EMBED_TITLE,
    CUSTOM_ARGUMENT,
    CUSTOM_ARGUMENT_PROVIDE(true),
    CUSTOM_DESCRIPTION,
    CUSTOM_PERMISSION,
    CUSTOM_SYNTAX_INVALID,
    CUSTOM_TYPE_INVALID,
    CUSTOM_TYPE_IMPLEMENTED,
    CUSTOM_TYPE_PRIVATE,
    CUSTOM_TYPE_ROLE_ADDED,
    CUSTOM_TYPE_ROLE_PERMISSION,
    CUSTOM_TYPE_ROLE_REMOVED,
    CUSTOM_TYPE_ROLE_TOGGLED,
    CUSTOM_TYPE_ROLE_UNKNOWN_ROLE,
    CUSTOM_TYPE_ROLE_UNKNOWN_USER,
    CUSTOM_TYPE_ROLE_VALUE,
    CUSTOM_VALUE_EMPTY,
    CUSTOM_VALUE_LENGTH,
    EMBED_FOOTER,
    EMBED_TITLE_COMMANDS,
    MISC_NONE,
    PAGE_FOOTER,
    PAGE_COMMAND_UNKNOWN,
    PERMISSION_PERMISSION,
    PERMISSION_ROLE,
    PERMISSION_INVALID,
    PUNISH_COMMAND_ALREADY_BANNED,
    PUNISH_COMMAND_ALREADY_MUTED,
    PUNISH_COMMAND_FAIL,
    PUNISH_COMMAND_REVOKE_FAIL,
    PUNISH_COMMAND_REVOKE_FIND,
    PUNISH_COMMAND_REVOKE_SUCCESS,
    PUNISH_COMMAND_SUCCESS,
    PUNISH_COMMAND_TIME_INVALID,
    PUNISH_COMMAND_TIME_PROVIDE,
    PUNISH_COMMAND_USER_INVALID,
    PUNISH_COMMAND_USER_PROVIDE,
    PUNISH_EMBED_AUTOMATIC,
    PUNISH_EMBED_EXPIRATION,
    PUNISH_EMBED_EXPIRATION_FOOTER,
    PUNISH_EMBED_REASON,
    PUNISH_EMBED_REASON_DEFAULT,
    PUNISH_EMBED_STAFF,
    PUNISH_EMBED_TITLE,
    PUNISH_EMBED_UNKNOWN,
    PUNISH_EMBED_USER,
    PUNISH_MUTE_INVALID_ROLE,
    PUNISH_MUTE_INVALID_PERMISSION,
    PUNISH_REASON_LENGTH,
    PUNISH_TYPE_BAN,
    PUNISH_TYPE_KICK,
    PUNISH_TYPE_MUTE,
    PUNISH_TYPE_SOFTBAN,
    PUNISH_TYPE_TEMPBAN,
    PUNISH_TYPE_TEMPMUTE,
    PUNISH_TYPE_UNBAN,
    PUNISH_TYPE_UNKNOWN,
    PUNISH_TYPE_UNMUTE,
    ZEUS_ERROR,
    ZEUS_ERROR_ARGUMENTS_INDEX,
    ZEUS_ERROR_BAN_REASON_LENGTH,
    ZEUS_ERROR_CHANNEL_NAME_LENGTH,
    ZEUS_ERROR_CHANNEL_NSFW_TYPE,
    ZEUS_ERROR_CHANNEL_POSITION_TYPE,
    ZEUS_ERROR_CHANNEL_TOPIC_LENGTH,
    ZEUS_ERROR_NICKNAME_LENGTH,
    ZEUS_ERROR_NICKNAME_PERMISSION,
    ZEUS_ERROR_MESSAGE_PIN_BOOLEAN,
    ZEUS_ERROR_MESSAGE_PIN_PERMISSION,
    ZEUS_ERROR_PROVIDED;

    /**
     * Returns a usable rest action that can be queued to send to the channel.
     * The replace parameter can be used to format the string.
     */
    fun send(channel: TextChannel, vararg format: String): RestAction<net.dv8tion.jda.core.entities.Message> {
        return channel.sendMessage(getContent(channel.guild.idLong, *format))
    }

    /**
     * Gets the content of the message for the specific guild.
     * The replace parameter can be used to format the string.
     */
    fun getContent(guild: Long, vararg format: String): String {
        val entry = Category.GUILD.entry as GuildEntry
        var content = Languages.getEntry(name.toLowerCase(), entry.fetch(entry.getField(GuildEntry.Fields.LANGUAGE), guild, null))
        if(prefix) {
            content = content.replace("{prefix}", entry.fetch(entry.getField(GuildEntry.Fields.PREFIX), guild, null))
        }
        content = content
                .replace("{github}", "https://github.com/Arraying/arraybot/")
                .replace("{zwsp}", "​")
                .replace("-", "    **-**")
        content = content.format(*format)
        return content
    }

    /**
     * Alias method to get the content of the message.
     */
    fun getContent(channel: TextChannel, vararg format: String): String {
        return getContent(channel.guild.idLong, *format)
    }

}