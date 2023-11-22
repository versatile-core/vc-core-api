package de.plk.core.api.spigot.game.state;

import de.plk.core.api.code.Nullable;
import org.bukkit.event.Listener;

/**
 * @author SoftwareBuilds
 * @since 22.11.2023 21:39
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public abstract class AbstractGameState implements IGameState {

    /**
     * The listener for the current state.
     */
    @Nullable
    private Listener listener;

    /**
     * {@inheritDoc}
     */
    @Override
    public Listener getListener() {
        return this.listener;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setListener(Listener listener) {
        this.listener = listener;
    }

}
