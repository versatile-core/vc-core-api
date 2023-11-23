package de.plk.core.api;

import de.plk.core.api.code.Nullable;
import de.plk.core.api.plugin.instance.IInstanceProxy;
import de.plk.core.api.plugin.IProxyPluginCore;
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
    @Nullable
    private static IProxyPluginCore pluginCore;

    /**
     * {@inheritDoc}
     */
    @Override
    public void onEnable() {
        PluginManager pluginManager = getProxy().getPluginManager();
        Plugin plugin = pluginManager.getPlugin("core");

        if (plugin instanceof IInstanceProxy instance) {
            pluginCore = instance.createPluginCore(this);
        }
    }

    /**
     * Get the instance of the core plugin.
     *
     * @return The instance of core plugin.
     */
    @Nullable
    public static IProxyPluginCore getInstance() {
        return pluginCore;
    }

}
