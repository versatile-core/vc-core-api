package de.plk.core.api.entity;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.spigot.board.IScoreboard;
import de.plk.core.api.spigot.skin.ISkin;
import org.bukkit.entity.Player;

/**
 * @author SoftwareBuilds
 * @since 17.11.2023 20:09
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface ISpigotPlayer extends IVersatilePlayer<Player> {

    /**
     * The players skin.
     *
     * @return The player skin.
     */
    @NotNull
    ISkin getSkin();

    /**
     * Set the players skin.
     *
     * @param skin Players skin.
     */
    void setSkin(@Nullable ISkin skin);

    /**
     * Get the active scoreboard of the player.
     *
     * @return The active scoreboard.
     */
    @Nullable
    IScoreboard getScoreboard();

}
