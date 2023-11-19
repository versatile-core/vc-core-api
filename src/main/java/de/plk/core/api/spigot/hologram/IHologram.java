package de.plk.core.api.spigot.hologram;

import org.bukkit.Location;

/**
 * @author SoftwareBuilds
 * @since 18.11.2023 19:03
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IHologram {

    /**
     * Get the hologram identifier.
     *
     * @return The hologram identifier,
     */
    String getHologramIdentifier();

    /**
     * Get the hologram location.
     *
     * @return The hologram location.
     */
    Location getLocation();

    /**
     * Set the hologram location.
     *
     * @param location Set the hologram location.
     */
    void setLocation(Location location);

    /**
     * Get the hologram lines.
     *
     * @return The hologram lines.
     */
    String[] getLines();

    /**
     * Set the hologram lines.
     *
     * @param lines The hologram lines.
     */
    void setLines(String[] lines);

    /**
     * Returns true if the hologram is a child
     *
     * @return True if the hologram is a child.
     */
    boolean isSmall();

    /**
     * Marks the hologram as a child or not.
     *
     * @param small True if the hologram would be a child.
     */
    void setSmall(boolean small);

}
