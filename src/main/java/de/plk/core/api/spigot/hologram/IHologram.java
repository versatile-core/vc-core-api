package de.plk.core.api.spigot.hologram;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.utils.IIdentifier;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

/**
 * @author SoftwareBuilds
 * @since 18.11.2023 19:03
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IHologram extends IIdentifier {

    /**
     * Get the hologram location.
     *
     * @return The hologram location.
     */
    @Nullable
    Location getLocation();

    /**
     * Set the hologram location.
     *
     * @param location Set the hologram location.
     */
    void setLocation(@Nullable Location location);

    /**
     * Get the hologram lines.
     *
     * @return The hologram lines.
     */
    @NotNull
    String[] getLines();

    /**
     * Set the hologram lines.
     *
     * @param lines The hologram lines.
     */
    void setLines(@NotNull String[] lines);

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
    void setSmall(@NotNull boolean small);

    /**
     * Add an item to the hologram.
     *
     * @param item The item.
     */
    void setHeadItem(@Nullable ItemStack item);

    /**
     * Add a rotation for the head.
     *
     * @param angleVector The rotation of the head.
     * @param animated True if the head rotation will be animated.
     */
    void addHeadRotation(@Nullable Vector angleVector, @Nullable boolean animated);

    /**
     * The item on the head.
     */
    @Nullable
    ItemStack getHeadItem();

}
