package de.plk.core.api.plugin;

import de.plk.core.api.AbstractVersatileProxy;

/**
 * @author SoftwareBuilds
 * @since 07.08.2023 20:36
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IInstanceProxy {

    /**
     * Wrap the instance of plugin core to another plugin.
     *
     * @param plugin The other plugin.
     *
     * @return The new plugin core for the other plugin.
     */
    IProxyPluginCore createPluginCore(AbstractVersatileProxy plugin);

}
