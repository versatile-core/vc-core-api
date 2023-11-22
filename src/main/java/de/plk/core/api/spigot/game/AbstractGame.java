package de.plk.core.api.spigot.game;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.spigot.game.state.IGameState;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SoftwareBuilds
 * @since 07.08.2023 14:06
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public abstract class AbstractGame implements IGame {

    /**
     * The loaded game states.
     */
    @NotNull
    protected final Set<IGameState> gameStates = new HashSet<>();

    /**
     * The current game state.
     */
    @Nullable
    protected IGameState currentGameState;

    /**
     * {@inheritDoc}
     */
    @Override
    public IGameState getCurrentGameState() {
        return currentGameState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<IGameState> getGameStates() {
        return gameStates;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCurrentGameState(IGameState gameState) {
        if (currentGameState != null)
            currentGameState.onStop();

        currentGameState = gameState;
        currentGameState.onStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void stopCurrentGameState() {
        if (currentGameState != null) {
            currentGameState.onStop();
            currentGameState = null;
        }
    }

}
