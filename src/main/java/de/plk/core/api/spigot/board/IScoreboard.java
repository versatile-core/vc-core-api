package de.plk.core.api.spigot.board;

import de.plk.core.api.spigot.board.team.IScoreboardTeam;
import de.plk.core.api.spigot.board.team.ITeamBuilder;
import de.plk.core.api.spigot.board.team.TeamIdentifierFilter;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.DisplaySlot;

import java.util.Map;
import java.util.Optional;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 23:04
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IScoreboard {

    /**
     * Get the scoreboard identifier.
     *
     * @return The scoreboard identifier.
     */
    String getScoreboardIdentifier();

    /**
     * Get the scoreboard type.
     *
     * @return The scoreboard type.
     */
    DisplaySlot getScoreboardType();

    /**
     * Get the scoreboard title.
     *
     * @return The scoreboard title.
     */
    String getScoreboardTitle();

    /**
     * Get the scoreboard rows.
     *
     * @return The scoreboard rows.
     */
    Map<Integer, IRow> getRows();

    /**
     * Get a specific registered scoreboard team.
     *
     * @param identifierFilter The scoreboard team identifier.
     *
     * @return The scoreboard team optional.
     */
    Optional<IScoreboardTeam> getScoreboardTeam(TeamIdentifierFilter identifierFilter);

    /**
     * Get the scoreboard listener.
     *
     * @return The scoreboard listener.
     */
    Listener getScoreboardListener();

    /**
     * Get the team builder.
     *
     * @return The team builder.
     */
    ITeamBuilder getTeamBuilder();

    /**
     * Adding a scoreboard listener.
     *
     * @param listener The listener for this scoreboard.
     */
    void addScoreboardListener(Listener listener);

    /**
     * Set the scoreboard title.
     *
     * @param title The scoreboard title.
     */
    void setScoreboardTitle(String title);

    /**
     * Adding a row the scoreboard.
     *
     * @param position The row position.
     * @param row The row to add.
     */
    void addRow(int position, IRow row);

}
