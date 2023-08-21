package de.plk.core.api.command;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * @author SoftwareBuilds
 * @since 10.08.2023 10:49
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public abstract class AbstractBungeeCommand extends AbstractCommand<CommandSender> {

    /**
     * The bungee plugin instance.
     */
    private final Plugin plugin;

    /**
     * Creates the abstract bungee command instance from subclass.
     *
      * @param plugin The bungee plugin instance.
     */
    public AbstractBungeeCommand(Plugin plugin) {
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
