package de.plk.core.api.spigot.game;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.spigot.game.state.IGameState;
import de.plk.core.api.utils.IIdentifier;

import java.util.Set;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 00:33
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IGame extends IIdentifier {

    /**
     * The active running game state.
     *
     * @return The current game state.
     */
    @Nullable
    IGameState getCurrentGameState();

    /**
     * Get the list of all game states.
     *
     * @return All game states.
     */
    @NotNull
    Set<IGameState> getGameStates();

    /**
     * Sets the current game state.
     *
     * @param gameState The game state you wish to set to.
     */
    void setCurrentGameState(@Nullable IGameState gameState);

    /**
     * Stops the current game state.
     */
    void stopCurrentGameState();

}
