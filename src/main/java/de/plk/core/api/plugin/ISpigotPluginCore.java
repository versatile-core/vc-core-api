package de.plk.core.api.plugin;

import de.plk.core.api.spigot.board.IScoreboardManager;
import de.plk.core.api.spigot.hologram.IHologramManager;
import de.plk.core.api.spigot.inventory.IInventoryManager;
import de.plk.core.api.task.ITaskManager;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 22:39
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface ISpigotPluginCore extends IPluginCore {

    /**
     * Get the scoreboard manager.
     *
     * @return The scoreboard manager.
     */
    IScoreboardManager getScoreboardManager();

    /**
     * Get the inventory manager.
     *
     * @return The inventory manager.
     */
    IInventoryManager getInventoryManager();

    /**
     * Get the task manager.
     *
     * @return The task manager.
     */
    ITaskManager getTaskManager();

    /**
     * Get the hologram manager.
     *
     * @return The hologram manager.
     */
    IHologramManager getHologramManager();

}
