package de.plk.core.api.spigot.board.team;

import org.bukkit.ChatColor;

/**
 * @author SoftwareBuilds
 * @since 17.11.2023 20:17
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface ITeamBuilder {

    /**
     * Set the prefix of a scoreboard team.
     *
     * @param prefix The prefix.
     *
     * @return The team builder.
     */
    ITeamBuilder setPrefix(String prefix);

    /**
     * Set the suffix of a scoreboard team.
     *
     * @param suffix The suffix.
     *
     * @return The team builder.
     */
    ITeamBuilder setSuffix(String suffix);

    /**
     * Set the identifier of a scoreboard team.
     *
     * @param identifier The identifier.
     *
     * @return The team builder.
     */
    ITeamBuilder setIdentifier(String identifier);

    /**
     * Set the update string of a scoreboard team.
     *
     * @param updatedString The update string.
     *
     * @return The team builder.
     */
    ITeamBuilder setUpdatedString(String updatedString, Object... values);

    /**
     * Set the scoreboard team entry.
     *
     * @param color The scoreboard team entry.
     * @return The team builder.
     */
    ITeamBuilder setEntry(ChatColor color);

    /**
     * The built scoreboard team.
     *
     * @return The built scoreboard team.
     */
    IScoreboardTeam build();

}
