package de.plk.core.api.task;

import de.plk.core.api.task.delayed.IDelayedTask;
import de.plk.core.api.task.repeat.IRepeatingTask;
import de.plk.core.api.utils.IManager;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 17:42
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface ITaskManager extends IManager<ITaskIdentifier> {

    /**
     * Creates a delayed task.
     *
     * @param taskName The registration name for the task.
     * @param delayedTicks The delayed ticks of the task.
     *
     * @return The delayed task.
     */
    IDelayedTask createDelayedTask(String taskName, long delayedTicks);

    /**
     * Creates a repeating task.
     *
     * @param taskName       The registration name for the task.
     * @param delayedTicks   The delayed ticks of the task.
     * @param repeatingTicks The repeating ticks of the task.
     *
     * @return The repeating task.
     */
    IRepeatingTask createRepeatingTask(String taskName, long delayedTicks, long repeatingTicks);

}
