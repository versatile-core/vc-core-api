package de.plk.core.api.spigot.game.map;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.spigot.game.team.IGameTeam;
import de.plk.core.api.utils.id.IIdentifier;
import org.bukkit.Location;

import java.util.List;

/**
 * @author SoftwareBuilds
 * @since 22.11.2023 20:05
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IGameMap extends IIdentifier {

    /**
     * Get the title of the map.
     *
     * @return The title of the map.
     */
    @NotNull
    String getTitle();

    /**
     * Get the builder of the map.
     *
     * @return The builder of the map.
     */
    @NotNull
    String getBuilder();

    /**
     * Get the registered teams on the map.
     *
     * @return The registered teams.
     */
    @NotNull
    List<IGameTeam> getTeams();

    /**
     * Get the location from the key on the map.
     *
     * @param key The key enum.
     *
     * @return The location associated with the key.
     *
     * @param <E> The key enum type.
     */
    @NotNull
    <E extends IKeyableEnum> Location getLocation(@NotNull E key, @NotNull String identifier);

    /**
     * Get the locations from the key on the map.
     *
     * @param key The key enum.
     *
     * @return The list of location associated with the key.
     *
     * @param <E> The key enum type.
     */
    @NotNull
    <E extends IKeyableEnum> List<Location> getLocations(@NotNull E key);

}
