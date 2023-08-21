package de.plk.core.api.language.message;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 23:14
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IMessage {

    /**
     * The config key for the message value.
     *
     * @return The config key.
     */
    String getKey();

    /**
     * Replace the message arguments with wished values.
     *
     * @param replacements The values.
     *
     * @return The replaced message.
     */
    default String getWithReplace(Object... replacements) {
        return String.format(getMessage(), replacements);
    }

    /**
     * Get the message.
     *
     * @return The message.
     */
    String getMessage();

}
