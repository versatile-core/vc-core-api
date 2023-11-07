package de.plk.core.api.log;

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
    void log(LogType type, String message);

    /**
     * Logging messages with type info.
     *
     * @param message The message to log.
     */
    default void info(String message) {
        log(LogType.INFO, message);
    }

    /**
     * Logging messages with type warning.
     *
     * @param message The message to log.
     */
    default void warning(String message) {
        log(LogType.WARNING, message);
    }

    /**
     * Logging messages with type error.
     *
     * @param message The message to log.
     */
    default void error(String message) {
        log(LogType.ERROR, message);
    }

}
