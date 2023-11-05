package de.plk.core.api;

import de.plk.core.api.plugin.IInstance;
import de.plk.core.api.plugin.IPluginCore;
import de.plk.core.api.task.ITaskManager;
import de.plk.core.api.task.delayed.IDelayedTask;
import de.plk.core.api.task.repeat.IRepeatCounter;
import de.plk.core.api.task.repeat.IRepeatingTask;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 22:39
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public abstract class AbstractVersatileProxy extends Plugin {

    /**
     * The plugin core.
     */
    private static IPluginCore pluginCore;

    /**
     * {@inheritDoc}
     */
    @Override
    public void onEnable() {
        PluginManager pluginManager = getProxy().getPluginManager();
        Plugin plugin = pluginManager.getPlugin("core");

        if (plugin instanceof IInstance) {
            IInstance<Plugin> instance = (IInstance<Plugin>) plugin;
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
