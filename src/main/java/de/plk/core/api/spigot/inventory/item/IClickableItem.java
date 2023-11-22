package de.plk.core.api.spigot.inventory.item;

import de.plk.core.api.code.NotNull;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 19:00
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IClickableItem extends IItem {

    /**
     * Get the click event of the item.
     */
    @NotNull
    IClickEvent getClickEvent();

}
