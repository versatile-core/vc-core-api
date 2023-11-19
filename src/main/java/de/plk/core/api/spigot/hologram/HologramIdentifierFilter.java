package de.plk.core.api.spigot.hologram;

import java.util.function.Predicate;

/**
 * @author SoftwareBuilds
 * @since 09.08.2023 13:27
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public class HologramIdentifierFilter implements Predicate<IHologram> {

    /**
     * The hologram identifier to test for.
     */
    private final String hologramIdentifier;

    /**
     * Construct a hologram identifier predicate test.
     *
     * @param hologramIdentifier The hologram identifier.
     */
    public HologramIdentifierFilter(String hologramIdentifier) {
        this.hologramIdentifier = hologramIdentifier;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean test(IHologram hologram) {
        return hologram.getHologramIdentifier().equals(hologramIdentifier);
    }

}
