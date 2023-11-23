package de.plk.core.api.task;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.utils.id.IIdentifier;
import org.bukkit.scheduler.BukkitTask;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 19:16
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface ITask<T> extends IIdentifier {

    /**
     * Runnable of the execution.
     *
     * @param task The execution runnable
     */
    void taskExecutionContent(@NotNull T task);

    /**
     * Starting of the scheduler.
     */
    void start();

    /**
     * Stopping of the scheduler.
     */
    void stop();

    /**
     * Check if the scheduler is an async one.
     *
     * @return True if the scheduler is async.
     */
    boolean isAsync();

    /**
     * Get the task.
     *
     * @return The task.
     */
    @NotNull
    BukkitTask getTask();

}
