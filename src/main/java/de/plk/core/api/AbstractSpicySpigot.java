package de.plk.core.api;

import de.plk.core.api.plugin.IInstance;
import de.plk.core.api.plugin.IPluginCore;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 22:36
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public abstract class AbstractSpicySpigot extends JavaPlugin {

    /**
     * The plugin core.
     */
    private static IPluginCore pluginCore;

    /**
     * {@inheritDoc}
     */
    @Override
    public void onEnable() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        Plugin plugin = pluginManager.getPlugin("core");

        if (plugin instanceof IInstance) {
            IInstance<JavaPlugin> instance = (IInstance<JavaPlugin>) plugin;
            pluginCore = instance.createPluginCore(this);
        }
    }

    /**
     * Get the instance of the core plugin.
     *
     * @return The instance of core plugin.
     */
    public static IPluginCore getInstance() {
        return pluginCore;
    }
}