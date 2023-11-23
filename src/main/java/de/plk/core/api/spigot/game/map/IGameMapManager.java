package de.plk.core.api.spigot.game.map;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.utils.IManager;

/**
 * @author SoftwareBuilds
 * @since 23.11.2023 18:15
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IGameMapManager extends IManager<IGameMap> {

    /**
     * Create a game map.
     *
     * @param mapIdentifier The map identifier.
     * @param builder The builder of the map.
     * @param teamAmount The amount of the teams.
     *
     * @return The created game map.
     */
    IGameMap createMap(
            @NotNull String mapIdentifier,
            @Nullable String builder,
            int teamAmount
    );

}
