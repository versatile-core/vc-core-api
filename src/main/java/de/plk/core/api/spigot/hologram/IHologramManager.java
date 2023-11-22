package de.plk.core.api.spigot.hologram;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
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
    @NotNull
    IHologram createHologram(
            @NotNull
            String hologramIdentifier,
            @NotNull
            String[] lines,
            @Nullable
            Location location,
            @NotNull
            boolean small
    );

    /**
     * Spawn the entity hologram.
     *
     * @param hologram The hologram to spawn.
     */
    void summon(@NotNull IHologram hologram);

}
