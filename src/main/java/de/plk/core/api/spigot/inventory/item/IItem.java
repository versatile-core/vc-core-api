package de.plk.core.api.spigot.inventory.item;

import org.bukkit.inventory.ItemStack;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 19:11
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@FunctionalInterface
public interface IItem {

    /**
     * Get the item stack.
     *
     * @return The item stack.
     */
    ItemStack getItemStack();

}
