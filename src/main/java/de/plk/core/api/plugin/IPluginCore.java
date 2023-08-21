package de.plk.core.api.plugin;

import de.plk.core.api.command.ICommandManager;
import de.plk.core.api.config.IConfigManager;
import de.plk.core.api.database.IDatabaseManager;
import de.plk.core.api.language.ILanguage;
import de.plk.core.api.log.ILogger;
import de.plk.core.api.spigot.board.IScoreboardManager;
import de.plk.core.api.spigot.game.IGame;
import de.plk.core.api.spigot.inventory.IInventoryManager;
import de.plk.core.api.utils.IManager;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 22:39
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IPluginCore {

    /**
     * Get the command manager.
     *
     * @return The command manager.
     */
    ICommandManager getCommandManager();

    /**
     * Get the database manager.
     *
     * @return The database manager.
     */
    IDatabaseManager getDatabaseManager();

    /**
     * Get the config manager.
     *
     * @return The config manager.
     */
    <T> IConfigManager<T> getConfigManager();

    /**
     * Get the scoreboard manager.
     *
     * @return The scoreboard manager.
     */
    IScoreboardManager getScoreboardManager();

    /**
     * Get the game manager.
     *
     * @return The game manager.
     */
    IManager<IGame> getGameManager();

    /**
     * Get the language manager.
     *
     * @return The language manager.
     */
    IManager<ILanguage> getLanguageManager();

    /**
     * Creates a logger.
     *
     * @param channel The loggers channel.
     *
     * @return The logger.
     */
    ILogger createLogger(String channel);

    /**
     * Get the inventory manager.
     *
     * @return The inventory manager.
     */
    IInventoryManager getInventoryManager();

}
