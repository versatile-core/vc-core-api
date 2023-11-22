package de.plk.core.api.command;

import de.plk.core.api.AbstractVersatileSpigot;
import de.plk.core.api.code.NotNull;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;

/**
 * @author SoftwareBuilds
 * @since 08.08.2023 11:12
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public abstract class AbstractSpigotCommand extends AbstractCommand<CommandSender> {

    /**
     * The spigot plugin instance.
     */
    @NotNull
    private final AbstractVersatileSpigot plugin;

    /**
     * Construct the abstract spigot command instance from subclass.
     *
     * @param plugin The spigot plugin instance.
     */
    public AbstractSpigotCommand(@NotNull AbstractVersatileSpigot plugin) {
        this.plugin = plugin;
    }

    /**
     * {@inheritDoc}
     */
    public void register() {
        final PluginCommand pluginCommand = plugin.getCommand(getCommandInfo().name());

        if (pluginCommand != null) {
            pluginCommand.setExecutor(
                    (commandSender, command, s, strings) -> executeCommand(commandSender, strings)
            );
        }
    }

}
