package de.plk.core.api.language;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.language.message.IMessageManager;
import de.plk.core.api.utils.IIdentifier;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 23:14
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface ILanguage extends IIdentifier {

    /**
     * The name of the language.
     *
     * @return The name of the language.
     */
    @NotNull
    String getName();

    /**
     * Get the message manager.
     *
     * @return The message manager.
     */
    @NotNull
    IMessageManager getMessageManager();

}
