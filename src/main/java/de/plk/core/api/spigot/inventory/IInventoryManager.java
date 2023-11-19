package de.plk.core.api.spigot.inventory;

import de.plk.core.api.utils.IManager;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.Optional;

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
     * Creates an inventory.
     *
     * @param inventoryIdentifier The inventory identifier.
     * @param title The inventory title.
     * @param size The inventory size.
     *
     * @return The inventory.
     */
    IInventory createInventory(
            String inventoryIdentifier,
            String title,
            int size
    );

    /**
     * Creates an inventory.
     *
     * @see #createInventory(String, String, int)
     *
     * @param inventoryIdentifier The inventory identifier.
     * @param title The inventory title.
     * @param size The inventory size.
     * @param fullUnclickable True if the scoreboard is not full clickable.
     *
     * @return The inventory.
     */
    IInventory createInventory(
            String inventoryIdentifier,
            String title,
            int size,
            boolean fullUnclickable
    );

    /**
     * Close players inventory.
     *
     * @param player The player.
     */
    void closeInventory(Player player);

    /**
     * Get all the registered active inventories.
     *
     * @return All registered active inventories.
     */
    Map<Player, IInventory> getAllActiveInventories();

    /**
     * Get the inventory by the player.
     *
     * @param player The player.
     *
     * @return The inventory optional.
     */
    Optional<IInventory> getInventoryByPlayer(Player player);

    /**
     * Get the inventory by the identifier.
     *
     * @param inventoryByIdFilter The identifier.
     *
     * @return The inventory optional.
     */
    Optional<IInventory> getInventoryByIdentifier(InventoryByIdFilter inventoryByIdFilter);

    /**
     * Register all inventory listeners.
     */
    void registerAllListeners();

}
