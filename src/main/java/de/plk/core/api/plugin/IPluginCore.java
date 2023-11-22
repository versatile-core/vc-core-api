package de.plk.core.api.plugin;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.command.ICommandManager;
import de.plk.core.api.config.IConfigManager;
import de.plk.core.api.database.IDatabaseManager;
import de.plk.core.api.language.ILanguage;
import de.plk.core.api.log.ILogger;
import de.plk.core.api.spigot.game.IGame;
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
    @NotNull
    ICommandManager getCommandManager();

    /**
     * Get the database manager.
     *
     * @return The database manager.
     */
    @NotNull
    IDatabaseManager getDatabaseManager();

    /**
     * Get the config manager.
     *
     * @return The config manager.
     */
    @NotNull
    <T> IConfigManager<T> getConfigManager();

    /**
     * Get the game manager.
     *
     * @return The game manager.
     */
    @NotNull
    IManager<IGame> getGameManager();

    /**
     * Get the language manager.
     *
     * @return The language manager.
     */
    @NotNull
    IManager<ILanguage> getLanguageManager();

    /**
     * Creates a logger.
     *
     * @param channel The loggers channel.
     *
     * @return The logger.
     */
    @NotNull
    ILogger createLogger(@Nullable String channel);

}
