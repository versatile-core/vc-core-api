package de.plk.core.api.spigot.game.state;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 00:33
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IGameState {

    /**
     * Runs the game state.
     */
    void onStart();

    /**
     * Stops the game state.
     */
    void onStop();

}
