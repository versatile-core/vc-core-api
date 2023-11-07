package de.plk.core.api.command;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author SoftwareBuilds
 * @since 08.08.2023 11:12
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public abstract class AbstractSpigotCommand extends AbstractCommand<CommandSender> {

    /**
     * The spigot plugin instance.
     */
    private final JavaPlugin plugin;

    /**
     * Construct the abstract spigot command instance from subclass.
     *
     * @param plugin The spigot plugin instance.
     */
    public AbstractSpigotCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    /**
     * {@inheritDoc}
     */
    public void register() {
        plugin.getCommand(getCommandInfo().name()).setExecutor(
                (commandSender, command, s, strings) -> executeCommand(commandSender, strings)
        );
    }

}
