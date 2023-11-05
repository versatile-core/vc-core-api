package de.plk.core.api.spigot.game;

import de.plk.core.api.spigot.game.state.IGameState;

import java.util.Set;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 00:33
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IGame {

    /**
     * Get the game identifier.
     *
     * @return The game identifier.
     */
    String getGameIdentifier();

    /**
     * The active running game state.
     *
     * @return The current game state.
     */
    IGameState getCurrentGameState();

    /**
     * Get the list of all game states.
     *
     * @return All game states.
     */
    Set<IGameState> getGameStates();

    /**
     * Sets the current game state.
     *
     * @param gameState The game state you wish to set to.
     */
    void setCurrentGameState(IGameState gameState);

    /**
     * Stops the current game state.
     */
    void stopCurrentGameState();

}
