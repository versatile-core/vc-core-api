package de.plk.core.api.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 23:08
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CommandInfo {

    /**
     * The version of the command.
     *
     * @return Command version.
     */
    CommandVersion commandVersion();

    /**
     * The name of the command.
     *
     * @return The command name.
     */
    String name();

    /**
     * The needed permission to execute the command.
     *
     * @return The permission key.
     */
    String permission() default "";

    /**
     * The candidates of command name.
     *
     * @return The aliases.
     */
    String[] aliases() default "";

    /**
     * The minimum count of args to handle the execution.
     *
     * @return Min args needed for command execution.
     */
    int minArgs() default 0;

    /**
     * The maximum count of args to handle the execution.
     *
     * @return Max args needed for command execution.
     */
    int maxArgs() default 0;

    enum CommandVersion {
        BUNGEECORD, SPIGOT
    }

}
