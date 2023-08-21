package de.plk.core.api.spigot.inventory;

import de.plk.core.api.utils.IManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 20:22
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IInventoryManager extends IManager<IInventory> {

    /**
     * Opens the inventory for the player.
     *
     * @param player    The player.
     * @param inventory The inventory.
     */
    void openInventory(Player player, IInventory inventory);

    /**
     * Close players inventory.
     *
     * @param player The player.
     */
    void closeInventory(Player player);

    /**
     * Updates the inventory for the player.
     *
     * @param player    The player.
     * @param inventory The inventory.
     */
    void updateInventory(Player player, IInventory inventory);

    /**
     * Get the inventory listener.
     *
     * @return The inventory listener.
     */
    Listener getInventoryListener();

}
