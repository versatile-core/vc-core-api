package de.plk.core.api.spigot.game.team;

import de.plk.core.api.code.Nullable;
import de.plk.core.api.entity.ISpigotPlayer;
import de.plk.core.api.utils.IManager;
import org.bukkit.ChatColor;

import java.util.Optional;

/**
 * @author SoftwareBuilds
 * @since 22.11.2023 20:15
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IGameManager extends IManager<IGameTeam> {

    /**
     * Get the team by the player.
     *
     * @param spigotPlayer The spigot player.
     *
     * @return The optional team.
     */
    Optional<IGameTeam> getTeamByPlayer(@Nullable ISpigotPlayer spigotPlayer);


    /**
     * Get the team by the color.
     *
     * @param color The color.
     *
     * @return The optional team.
     */
    Optional<IGameTeam> getTeamByColor(@Nullable ChatColor color);

}
