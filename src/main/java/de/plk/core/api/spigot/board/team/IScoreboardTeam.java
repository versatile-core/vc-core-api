package de.plk.core.api.spigot.board.team;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.spigot.board.IRow;
import de.plk.core.api.utils.id.IIdentifier;
import de.plk.core.api.utils.IListenable;
import org.bukkit.ChatColor;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 23:05
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IScoreboardTeam extends IRow, IIdentifier, IListenable {

    /**
     * Get the prefix in row.
     *
     * @return The prefix.
     */
    @NotNull
    String getPrefix();

    /**
     * Set the updated string.
     *
     * @param updatedString The updated string.
     * @param values The values.
     */
    void update(@NotNull String updatedString, @NotNull Object... values);

    /**
     * Get the suffix in row.
     *
     * @return The suffix.
     */
    @NotNull
    String getSuffix();

    /**
     * Get the entry as non see entry.
     *
     * @return The entry as non see entry.
     */
    @NotNull
    ChatColor getEntry();

}
