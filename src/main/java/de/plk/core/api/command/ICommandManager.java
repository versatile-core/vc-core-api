package de.plk.core.api.command;

import de.plk.core.api.utils.IManager;

/**
 * @author SoftwareBuilds
 * @since 09.08.2023 12:53
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface ICommandManager extends IManager<AbstractCommand> {

    /**
     * Register all commands.
     */
    void registerAllCommands();

}
