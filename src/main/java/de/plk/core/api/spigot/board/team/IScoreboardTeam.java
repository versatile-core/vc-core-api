package de.plk.core.api.spigot.board.team;

import de.plk.core.api.spigot.board.IRow;
import org.bukkit.ChatColor;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 23:05
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IScoreboardTeam extends IRow {

    /**
     * Get the team identifier.
     *
     * @return The identifier.
     */
    String getTeamIdentifier();

    /**
     * Get the prefix in row.
     *
     * @return The prefix.
     */
    String getPrefix();

    /**
     * Set the updated string.
     *
     * @param updatedString The updated string.
     * @param values The values.
     */
    void update(String updatedString, Object... values);

    /**
     * Get the suffix in row.
     *
     * @return The suffix.
     */
    String getSuffix();

    /**
     * Get the entry as non see entry.
     *
     * @return The entry as non see entry.
     */
    ChatColor getEntry();

}
