package de.plk.core.api.task;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 17:49
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@FunctionalInterface
public interface ITaskExecutor<T> {

    void execute(ITask<T> task);

}
