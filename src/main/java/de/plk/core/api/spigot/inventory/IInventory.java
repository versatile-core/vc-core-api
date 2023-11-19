package de.plk.core.api.spigot.inventory;

import de.plk.core.api.spigot.inventory.item.IItem;
import org.bukkit.event.Listener;

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
     * The inventory title.
     *
     * @param title The title.
     */
    void setInventoryTitle(String title);

    /**
     * Get the inventory size.
     *
     * @return The inventory size.
     */
    int getInventorySize();

    /**
     * The inventory size.
     *
     * @param size The size.
     */
    void setInventorySize(int size);

    /**
     * Checks if the inventory is full clickable.
     *
     * @return True if inventory is clickable.
     */
    boolean fullUnclickable();

    /**
     * Set the inventory full unclickable.
     *
     * @param fullUnclickable True if full unlickable.
     */
    void setFullUnclickable(boolean fullUnclickable);

    /**
     * Get the inventory contents.
     *
     * @return The inventory contents.
     */
    Map<Integer, IItem> getInventoryContents();

    /**
     * Add the inventory listener.
     *
     * @param listener The inventory listener.
     */
    void addInventoryListener(Listener listener);

    /**
     * Get the registered inventory listener.
     *
     * @return The registered inventory listener.
     */
    Listener getInventoryListener();

}
