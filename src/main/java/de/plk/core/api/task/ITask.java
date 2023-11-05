package de.plk.core.api.task;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 19:16
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface ITask<T> extends ITaskIdentifier {

    /**
     * Runnable of the execution.
     *
     * @param task The execution runnable
     */
    void taskExecutionContent(T task);

    /**
     * Starting of the scheduler.
     */
    void start();

    /**
     * Stopping of the scheduler.
     */
    void stop();

}
