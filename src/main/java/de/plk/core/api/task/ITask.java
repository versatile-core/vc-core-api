package de.plk.core.api.task;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 18:09
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@FunctionalInterface
public interface ITask<T> {

    void apply(T task);

}
