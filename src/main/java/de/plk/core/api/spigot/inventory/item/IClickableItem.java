package de.plk.core.api.spigot.inventory.item;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 19:00
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IClickableItem extends IItem {

    /**
     * The click event of the item.
     */
    IClickEvent getClickEvent();

}
