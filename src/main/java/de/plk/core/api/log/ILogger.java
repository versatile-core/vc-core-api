package de.plk.core.api.log;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 23:09
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface ILogger {

    /**
     * The super log method.
     *
     * @param type    The type of logging.
     * @param message The message to log.
     */
    void log(@NotNull LogType type, @Nullable String message);

    /**
     * Logging messages with type info.
     *
     * @param message The message to log.
     */
    default void info(@Nullable String message) {
        log(LogType.INFO, message);
    }

    /**
     * Logging messages with type warning.
     *
     * @param message The message to log.
     */
    default void warning(@Nullable String message) {
        log(LogType.WARNING, message);
    }

    /**
     * Logging messages with type error.
     *
     * @param message The message to log.
     */
    default void error(@Nullable String message) {
        log(LogType.ERROR, message);
    }

}
