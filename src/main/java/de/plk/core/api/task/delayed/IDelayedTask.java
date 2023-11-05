package de.plk.core.api.task.delayed;

import de.plk.core.api.task.ITaskExecutor;
import de.plk.core.api.task.ITaskIdentifier;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 17:41
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IDelayedTask extends ITaskIdentifier, ITaskExecutor<IDelayedTask> {

    long getDelayedTicks();

    long setDelayedTicks(long ticks);

}
