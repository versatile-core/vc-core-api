package de.plk.core.api.plugin;

/**
 * @author SoftwareBuilds
 * @since 07.08.2023 20:36
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IInstance<P> {

    /**
     * Wrap the instance of plugin core to another plugin.
     *
     * @param plugin The other plugin.
     *
     * @return The new plugin core for the other plugin.
     */
    IPluginCore createPluginCore(P plugin);

}
