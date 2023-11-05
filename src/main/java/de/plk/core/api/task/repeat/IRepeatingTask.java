package de.plk.core.api.task.repeat;

import de.plk.core.api.task.ITaskExecutor;
import de.plk.core.api.task.ITaskIdentifier;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 17:41
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IRepeatingTask extends ITaskIdentifier, IRepeatCount, ITaskExecutor<IRepeatingTask> {

    long getDelayedTicks();

    long setDelayedTicks(long ticks);

    long getRepeatingTask();

    long setRepeatingTask(long ticks);

}
