package de.plk.core.api.spigot.board;

import de.plk.core.api.spigot.board.team.IScoreboardTeam;
import de.plk.core.api.utils.IManager;
import org.bukkit.entity.Player;

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
     * Update the players scoreboard team entries.
     *
     * @param player     The player.
     * @param scoreboard The scoreboard.
     */
    void updateScoreboard(Player player, IScoreboard scoreboard);

    /**
     * Removes the scoreboard.
     *
     * @param player The player.
     */
    void clearScoreboard(Player player);

    /**
     * Get the scoreboard team manager.
     *
     * @return The scoreboard team manager.
     */
    public IManager<IScoreboardTeam> getScoreboardTeamManager();

}
