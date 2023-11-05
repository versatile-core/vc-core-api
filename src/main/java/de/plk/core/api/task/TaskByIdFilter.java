package de.plk.core.api.task;

import java.util.function.Predicate;

/**
 * @author SoftwareBuilds
 * @since 10.08.2023 14:10
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public class TaskByIdFilter implements Predicate<ITaskIdentifier> {

    /**
     * The task identifier to test for.
     */
    private final String taskIdentifier;

    /**
     * Construct a task identifier predicate test.
     *
     * @param taskIdentifier The task identifier.
     */
    public TaskByIdFilter(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean test(ITaskIdentifier task) {
        return task.getTaskName().equals(taskIdentifier);
    }
}
