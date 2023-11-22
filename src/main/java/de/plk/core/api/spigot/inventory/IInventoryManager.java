package de.plk.core.api.spigot.inventory;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.entity.ISpigotPlayer;
import de.plk.core.api.utils.IManager;

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
     * @param spigotPlayer The player.
     * @param inventory The inventory.
     */
    void openInventory(@NotNull ISpigotPlayer spigotPlayer, @NotNull IInventory inventory);

    /**
     * Creates an inventory.
     *
     * @param inventoryIdentifier The inventory identifier.
     * @param title The inventory title.
     * @param size The inventory size.
     *
     * @return The inventory.
     */
    @NotNull
    IInventory createInventory(
            @NotNull
            String inventoryIdentifier,
            @NotNull
            String title,
            @Nullable
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
            @NotNull
            String inventoryIdentifier,
            @NotNull
            String title,
            @Nullable
            int size,
            @Nullable
            boolean fullUnclickable
    );

    /**
     * Close players inventory.
     *
     * @param player The player.
     */
    void closeInventory(@Nullable ISpigotPlayer player);

    /**
     * Get all the registered active inventories.
     *
     * @return All registered active inventories.
     */
    @NotNull
    Map<ISpigotPlayer, IInventory> getAllActiveInventories();

    /**
     * Get the inventory by the player.
     *
     * @param player The player.
     *
     * @return The inventory optional.
     */
    @NotNull
    Optional<IInventory> getInventoryByPlayer(@Nullable ISpigotPlayer player);

    /**
     * Register all inventory listeners.
     */
    void registerAllListeners();

}
