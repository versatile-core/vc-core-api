package de.plk.core.api;

import de.plk.core.api.code.Nullable;
import de.plk.core.api.plugin.IInstanceSpigot;
import de.plk.core.api.plugin.ISpigotPluginCore;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 22:36
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public abstract class AbstractVersatileSpigot extends JavaPlugin {

    /**
     * The plugin core.
     */
    @Nullable
    private static ISpigotPluginCore pluginCore;

    /**
     * {@inheritDoc}
     */
    @Override
    public void onEnable() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        Plugin plugin = pluginManager.getPlugin("core");

        if (plugin instanceof IInstanceSpigot instance) {
            pluginCore = instance.createPluginCore(this);
        }
    }

    /**
     * Get the instance of the core plugin.
     *
     * @return The instance of core plugin.
     */
    @Nullable
    public static ISpigotPluginCore getInstance() {
        return pluginCore;
    }

}
