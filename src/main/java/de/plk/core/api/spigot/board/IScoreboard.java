package de.plk.core.api.spigot.board;

import org.bukkit.event.Listener;
import org.bukkit.scoreboard.DisplaySlot;

import java.util.Map;

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
     * Get the scoreboard listener.
     *
     * @return The scoreboard listener.
     */
    Listener getScoreboardListener();

}
