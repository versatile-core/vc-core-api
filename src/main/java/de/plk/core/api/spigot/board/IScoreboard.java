package de.plk.core.api.spigot.board;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.spigot.board.team.ITeamBuilder;
import de.plk.core.api.utils.id.IIdentifier;
import de.plk.core.api.utils.IListenable;
import org.bukkit.scoreboard.DisplaySlot;

import java.util.Map;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 23:04
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IScoreboard extends IIdentifier, IListenable {

    /**
     * Get the scoreboard type.
     *
     * @return The scoreboard type.
     */
    @NotNull
    DisplaySlot getScoreboardType();

    /**
     * Get the scoreboard title.
     *
     * @return The scoreboard title.
     */
    @NotNull
    String getScoreboardTitle();

    /**
     * Get the scoreboard rows.
     *
     * @return The scoreboard rows.
     */
    @NotNull
    Map<Integer, IRow> getRows();

    /**
     * Get the team builder.
     *
     * @return The team builder.
     */
    @NotNull
    ITeamBuilder getTeamBuilder();

    /**
     * Set the scoreboard title.
     *
     * @param title The scoreboard title.
     */
    void setScoreboardTitle(@NotNull String title);

    /**
     * Adding a row the scoreboard.
     *
     * @param position The row position.
     * @param row The row to add.
     */
    void addRow(@NotNull int position, @NotNull IRow row);

    /**
     * Set a blank line in the scoreboard.
     *
     * @param row The row where the blank line will be.
     */
    void blankLine(int row);

}
