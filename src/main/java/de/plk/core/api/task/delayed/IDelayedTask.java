package de.plk.core.api.task.delayed;

import de.plk.core.api.task.ITask;
import de.plk.core.api.task.ITaskIdentifier;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 17:41
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IDelayedTask extends ITask<Runnable>, ITaskIdentifier {

    /**
     * Get the delayed ticks for the scheduler.
     *
     * @return The delayed ticks.
     */
    long getDelayedTicks();

    /**
     * Set the delayed ticks for the scheduler.
     *
     * @param ticks The delayed ticks.
     */
    void setDelayedTicks(long ticks);

}
