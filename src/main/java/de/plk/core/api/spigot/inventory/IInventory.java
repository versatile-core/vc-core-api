package de.plk.core.api.spigot.inventory;

import de.plk.core.api.spigot.inventory.item.IItem;

import java.util.Map;

public interface IInventory {

    /**
     * Get the inventory identifier.
     *
     * @return The inventory identifier.
     */
    String getInventoryIdentifier();

    /**
     * Get the inventory title.
     *
     * @return The inventory title.
     */
    String getInventoryTitle();

    /**
     * Get the inventory size.
     *
     * @return The inventory size.
     */
    int getInventorySize();

    /**
     * Checks if the inventory is full clickable.
     *
     * @return True if inventory is clickable.
     */
    boolean fullUnclickable();

    /**
     * Get the inventory contents.
     *
     * @return The inventory contents.
     */
    Map<Integer, IItem> getInventoryContents();

}
