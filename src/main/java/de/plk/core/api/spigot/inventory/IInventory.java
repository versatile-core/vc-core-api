package de.plk.core.api.spigot.inventory;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.utils.IListenable;
import de.plk.core.api.spigot.inventory.item.IItem;
import de.plk.core.api.utils.id.IIdentifier;

import java.util.Map;

public interface IInventory extends IIdentifier, IListenable {

    /**
     * Get the inventory title.
     *
     * @return The inventory title.
     */
    @NotNull
    String getInventoryTitle();

    /**
     * The inventory title.
     *
     * @param title The title.
     */
    void setInventoryTitle(@NotNull String title);

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
    void setInventorySize(@NotNull int size);

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
    void setFullUnclickable(@NotNull boolean fullUnclickable);

    /**
     * Get the inventory contents.
     *
     * @return The inventory contents.
     */
    @NotNull
    Map<Integer, IItem> getInventoryContents();

}
