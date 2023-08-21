package de.plk.core.api.config;

import java.util.Map;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 00:26
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IConfig<T> {

    /**
     * The config content as map.
     *
     * @return The map with content.
     */
    Map<String, T> getContent();

    /**
     * Append items to the config.
     *
     * @param key   The key where the value is pointed.
     * @param value The value pointed to the key.
     *
     * @return The appended config.
     */
    IConfig<T> append(String key, T value);

    /**
     * Removes an element from the config.
     *
     * @param key The key where the element is associated.
     *
     * @return The config with removed element.
     */
    IConfig<T> disappear(String key);

    /**
     * Clears the config content.
     */
    void clear();

}
