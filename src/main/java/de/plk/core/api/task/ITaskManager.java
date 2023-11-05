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

    ITaskIdentifier loadTask();

    IDelayedTask createDelayedTask(String taskName);

    IRepeatingTask createRepeatingTask(String taskName);

}
