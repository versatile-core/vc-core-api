package de.plk.core.api.database;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.database.query.IQuery;

import java.sql.Connection;
import java.util.concurrent.CompletableFuture;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 22:52
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IDatabaseManager {

    /**
     * Get the database connection.
     *
     * @return The database connection.
     */
    @Nullable
    Connection getConnection();

    /**
     * Connect the database connection.
     */
    void connect();

    /**
     * Disconnect the database connection.
     */
    void disconnect();

    /**
     * Checks if database is connected.
     *
     * @return True if database is connected.
     */
    boolean isConnected();

    /**
     * Run a synchronized query.
     *
     * @param query The query.
     *
     * @return The queried model.
     *
     * @param <M> The model type specification.
     */
    @NotNull
    <M extends IModel> M runSync(@NotNull IQuery<M> query);

    /**
     * Run an asynchronized query.
     * 
     * @see #runSync(IQuery).
     * 
     * @param query The query.
     * 
     * @return The queried model.
     * 
     * @param <M> The model type specification.
     */
    @NotNull
    default <M extends IModel> CompletableFuture<M> runAsync(@NotNull IQuery<M> query) {
        return CompletableFuture.supplyAsync(() -> runSync(query));
    }

}
