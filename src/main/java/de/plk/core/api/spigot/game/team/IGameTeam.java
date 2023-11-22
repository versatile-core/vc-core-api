package de.plk.core.api.spigot.game.team;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.entity.ISpigotPlayer;
import de.plk.core.api.utils.IIdentifier;
import org.bukkit.ChatColor;

import java.util.List;

/**
 * @author SoftwareBuilds
 * @since 22.11.2023 20:06
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IGameTeam extends IIdentifier {

    /**
     * Get the color of the team.
     *
     * @return The team color.
     */
    @NotNull
    ChatColor getColor();

    /**
     * Get the list of members.
     *
     * @return The list of members.
     */
    @NotNull
    List<ISpigotPlayer> getMembers();

    /**
     * Check if the team is full.
     *
     * @return True if the team is full.
     */
    boolean isFull();

    /**
     * Check if the team is eliminated,
     *
     * @return True if the team is eliminated.
     */
    boolean isEliminated();

    /**
     * Add a spigot player to the team.
     *
     * @param spigotPlayer The spigot player.
     */
    boolean addMember(@Nullable ISpigotPlayer spigotPlayer);

    /**
     * Remove a spigot player from the team.
     *
     * @param spigotPlayer The spigot player.
     */
    boolean removeMember(@Nullable ISpigotPlayer spigotPlayer);

}
