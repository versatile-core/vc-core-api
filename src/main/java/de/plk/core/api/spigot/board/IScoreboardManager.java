package de.plk.core.api.spigot.board;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.entity.ISpigotPlayer;
import de.plk.core.api.utils.IManager;
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
    void sendScoreboard(@NotNull ISpigotPlayer player, @NotNull IScoreboard scoreboard);

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
            @NotNull
            String scoreboardIdentifier,
            @NotNull
            DisplaySlot displaySlot,
            @NotNull
            String title
    );

    /**
     * Get the scoreboard by the player.
     *
     * @param spigotPlayer The spigot player.
     *
     * @return The scoreboard optional.
     */
    @NotNull
    Optional<IScoreboard> getScoreboardByPlayer(ISpigotPlayer spigotPlayer);

    /**
     * Removes the scoreboard.
     *
     * @param spigotPlayer The player.
     */
    void clearScoreboard(@Nullable ISpigotPlayer spigotPlayer);

    /**
     * Register all scoreboard listeners.
     */
    void registerAllListeners();

}
