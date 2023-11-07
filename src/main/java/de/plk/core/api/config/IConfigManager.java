package de.plk.core.api.config;

import java.io.File;
import java.util.concurrent.CompletableFuture;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 00:44
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IConfigManager<T> {

    /**
     * Loads a configuration specific to a type.
     *
     * @param file The file.
     *
     * @return The key value map with value as type values.
     */
    IConfig<T> loadConfiguration(File file);

    /**
     * Loads a configuration specific to a type async.
     *
     * @see #loadConfiguration(File).
     *
     * @param file The file.
     *
     * @return The key value map with value as type values.
     */
    default CompletableFuture<IConfig<T>> loadConfigurationAsync(File file) {
        return CompletableFuture.supplyAsync(() -> loadConfiguration(file));
    }

    /**
     * Saves the type specific content to a file.
     *.
     * @param config The content which would be saved.
     * @param file   The file.
     *
     * @return The state if saved.
     */
    boolean saveConfiguration(IConfig<T> config, File file);

    /**
     * Save a configuration specific to a type async.
     *
     * @see #saveConfiguration(IConfig, File).
     *
     * @param file The file.
     *
     * @return The state if saved.
     */
    default CompletableFuture<Boolean> saveConfigurationAsync(IConfig<T> config, File file) {
        return CompletableFuture.supplyAsync(() -> saveConfiguration(config, file));
    }

    /**
     * Create config.
     *
     * @return Created config.
     */
    IConfig<T> createConfig();

}
