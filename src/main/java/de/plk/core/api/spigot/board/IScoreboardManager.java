package de.plk.core.api.spigot.board;

import de.plk.core.api.utils.IManager;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;

import java.util.Optional;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 23:05
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IScoreboardManager extends IManager<IScoreboard> {

    /**
     * Send a scoreboard to the player.
     *
     * @param player     The player.
     * @param scoreboard The scoreboard.
     */
    void sendScoreboard(Player player, IScoreboard scoreboard);

    /**
     * Creates a player scoreboard.
     *
     * @param scoreboardIdentifier The identifier of the scoreboard.
     * @param displaySlot The type of the scoreboard.
     * @param title The title of the scoreboard.
     *
     * @return The scoreboard.
     */
    IScoreboard createScoreboard(
        String scoreboardIdentifier,
        DisplaySlot displaySlot,
        String title
    );

    /**
     * Get the scoreboard by the identifier.
     *
     * @param scoreboardIdentifier The identifier of the scoreboard.
     *
     * @return The scoreboard optional.
     */
    Optional<IScoreboard> getScoreboardByIdentifier(String scoreboardIdentifier);

    /**
     * Get the scoreboard by the identifier.

     *
     * @return The scoreboard optional.
     */
    Optional<IScoreboard> getScoreboardByPlayer(Player player);

    /**
     * Removes the scoreboard.
     *
     * @param player The player.
     */
    void clearScoreboard(Player player);

    /**
     * Register all scoreboard listeners.
     */
    void registerAllListeners();;

}
