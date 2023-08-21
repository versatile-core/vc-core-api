package de.plk.core.api.spigot.inventory.item;

import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 18:57
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@FunctionalInterface
public interface IClickEvent {

    /**
     * Runs when an item was clicked a clicked item.
     *
     * @param event The spigot click event.
     */
    void onClick(InventoryClickEvent event);

}
