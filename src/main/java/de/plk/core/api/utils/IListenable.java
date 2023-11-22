package de.plk.core.api.utils;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import org.bukkit.event.Listener;

/**
 * @author SoftwareBuilds
 * @since 22.11.2023 21:34
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IListenable {

    /**
     * Get the bukkit listener.
     *
     * @return The bukkit listener.
     */
    @Nullable
    Listener getListener();

    /**
     * The bukkit listener.
     *
     * @param listener The bukkit listener.
     */
    void setListener(@NotNull Listener listener);

}
