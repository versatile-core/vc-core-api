package de.plk.core.api.spigot.board.team;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
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
    @NotNull
    ITeamBuilder setPrefix(@Nullable String prefix);

    /**
     * Set the suffix of a scoreboard team.
     *
     * @param suffix The suffix.
     *
     * @return The team builder.
     */
    @NotNull
    ITeamBuilder setSuffix(@Nullable String suffix);

    /**
     * Set the identifier of a scoreboard team.
     *
     * @param identifier The identifier.
     *
     * @return The team builder.
     */
    @NotNull
    ITeamBuilder setIdentifier(@NotNull String identifier);

    /**
     * Set the update string of a scoreboard team.
     *
     * @param updatedString The update string.
     *
     * @return The team builder.
     */
    @NotNull
    ITeamBuilder setUpdatedString(@NotNull String updatedString, @NotNull Object... values);

    /**
     * Set the scoreboard team entry.
     *
     * @param color The scoreboard team entry.
     * @return The team builder.
     */
    @NotNull
    ITeamBuilder setEntry(@NotNull ChatColor color);

    /**
     * The built scoreboard team.
     *
     * @return The built scoreboard team.
     */
    @NotNull
    IScoreboardTeam build();

}
