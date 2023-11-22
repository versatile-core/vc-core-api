package de.plk.core.api.language.message;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.utils.IManager;

import java.io.File;

/**
 * @author SoftwareBuilds
 * @since 17.11.2023 19:37
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IMessageManager extends IManager<IMessage> {

    /**
     * Adding messages to the common ones.
     *
     * @param file The file with messages.
     */
    void attachMessages(@NotNull File file);

}
