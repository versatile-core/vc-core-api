package de.plk.core.api.spigot.inventory;

import java.util.function.Predicate;

/**
 * @author SoftwareBuilds
 * @since 10.08.2023 14:10
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public class InventoryByIdFilter implements Predicate<IInventory> {

    private final String identifier;

    public InventoryByIdFilter(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean test(IInventory inventory) {
        return inventory.getInventoryIdentifier().equals(identifier);
    }
}
