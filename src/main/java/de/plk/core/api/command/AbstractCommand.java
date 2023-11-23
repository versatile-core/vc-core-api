package de.plk.core.api.command;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.utils.id.IIdentifier;

/**
 * @author SoftwareBuilds
 * @since 10.08.2023 10:45
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public abstract class AbstractCommand<E> implements IIdentifier {

    /**
     * The method need to implement in the other plugins.
     *
     * @param executor The executor.
     * @param args     The arguments for the command.
     *
     * @return True if the command runs successfully.
     */
    public abstract boolean onSpicyCommand(@NotNull E executor, String[] args);

    /**
     * Wraps the spicy command with restrictions.
     *
     * @see #onSpicyCommand(Object, String[]).
     */
    public boolean executeCommand(@NotNull E executor, String[] args) {
        final CommandInfo commandInfo = getCommandInfo();

        // Checks whether the arguments fit within the limits of the specified command length.
        if (args.length >= commandInfo.minArgs() && args.length <= commandInfo.maxArgs()) {
            return onSpicyCommand(executor, args);
        } else {
            sendHelp(executor);
            return false;
        }
    }

    /**
     * {@inheritDoc}
     */
    public CommandInfo getCommandInfo() {
        if (!getClass().isAnnotationPresent(CommandInfo.class)) {
            throw new RuntimeException("The annotation was not found in the command class!");
        }

        return getClass().getAnnotation(CommandInfo.class);
    }

    /**
     * Send help to executor.
     *
     * @param executor The executor.
     */
    public abstract void sendHelp(@NotNull E executor);

    /**
     * Register the command to the plugin.
     */
    public abstract void register();

    /**
     * {@inheritDoc}
     */
    @Override
    public String getIdentifier() {
        final CommandInfo commandInfo = getCommandInfo();
        return commandInfo.name();
    }
}
