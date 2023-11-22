package de.plk.core.api.command;

import de.plk.core.api.AbstractVersatileProxy;
import de.plk.core.api.code.NotNull;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

/**
 * @author SoftwareBuilds
 * @since 10.08.2023 10:49
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public abstract class AbstractBungeeCommand extends AbstractCommand<CommandSender> {

    /**
     * The bungee plugin instance.
     */
    @NotNull
    private final AbstractVersatileProxy plugin;

    /**
     * Creates the abstract bungee command instance from subclass.
     *
      * @param plugin The bungee plugin instance.
     */
    public AbstractBungeeCommand(@NotNull AbstractVersatileProxy plugin) {
        this.plugin = plugin;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void register() {
        plugin.getProxy().getPluginManager().registerCommand(plugin, new Command(
                    getCommandInfo().name(),
                    getCommandInfo().permission(),
                    getCommandInfo().aliases()
                ) {
                    @Override
                    public void execute(CommandSender commandSender, String[] strings) {
                        executeCommand(commandSender, strings);
                    }
                }
        );
    }

}
