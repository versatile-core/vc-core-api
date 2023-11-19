package de.plk.core.api.spigot.hologram;

import de.plk.core.api.utils.IManager;
import org.bukkit.Location;

/**
 * @author SoftwareBuilds
 * @since 18.11.2023 19:06
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IHologramManager extends IManager<IHologram> {

    /**
     * Creates a hologram.
     *
     * @param hologramIdentifier The hologram identifier.
     * @param lines The hologram lines.
     * @param location The hologram location.
     * @param small True if the hologram looks like a child.
     *
     * @return The hologram.
     */
    IHologram createHologram(
            String hologramIdentifier,
            String[] lines,
            Location location,
            boolean small
    );

    /**
     * Get the hologram by identifier.
     *
     * @param hologramIdentifierFilter The identifier filter.
     *
     * @return The hologram.
     */
    IHologram getHologramById(HologramIdentifierFilter hologramIdentifierFilter);

    /**
     * Spawn the entity hologram.
     *
     * @param hologram The hologram to spawn.
     */
    void summon(IHologram hologram);

}
