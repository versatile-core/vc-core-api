package de.plk.core.api.task.repeat;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.task.ITask;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 17:41
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IRepeatingTask extends ITask<IRepeatingRunnable> {

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
    void setDelayedTicks(@NotNull long ticks);

    /**
     * Get the repeating ticks for the scheduler.
     *
     * @return The repeating ticks.
     */
    long getRepeatingTicks();

    /**
     * Set the repeating ticks for the scheduler.
     *
     * @param ticks The repeating ticks.
     */
    void setRepeatingTicks(@NotNull long ticks);

    /**
     * Sets the beginning of a repeating counter.
     *
     * @param begin The beginning of the counter.
     */
    void setRepeatingCounterBegin(@NotNull int begin);

    /**
     * Get the repeating counter.
     *
     * @return The repeating counter.
     */
    @NotNull
    IRepeatCounter getTheRepeatingCounter();

}
