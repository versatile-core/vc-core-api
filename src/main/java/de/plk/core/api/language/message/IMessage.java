package de.plk.core.api.language.message;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.utils.IIdentifier;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 23:14
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IMessage extends IIdentifier {

    /**
     * Replace the message arguments with wished values.
     *
     * @param replacements The values.
     *
     * @return The replaced message.
     */
    @NotNull
    default String getWithReplace(@NotNull Object... replacements) {
        return String.format(getMessage(), replacements);
    }

    /**
     * Get the message.
     *
     * @return The message.
     */
    @NotNull
    String getMessage();

}
