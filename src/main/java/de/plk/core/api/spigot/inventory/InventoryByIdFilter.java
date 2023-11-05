package de.plk.core.api.spigot.inventory;

import java.util.function.Predicate;

/**
 * @author SoftwareBuilds
 * @since 10.08.2023 14:10
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public class InventoryByIdFilter implements Predicate<IInventory> {

    /**
     * The inventory identifier to test for.
     */
    private final String inventoryIdentifier;

    /**
     * Construct an inventory identifier predicate test.
     *
     * @param inventoryIdentifier The inventory identifier.
     */
    public InventoryByIdFilter(String inventoryIdentifier) {
        this.inventoryIdentifier = inventoryIdentifier;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean test(IInventory inventory) {
        return inventory.getInventoryIdentifier().equals(inventoryIdentifier);
    }
}
