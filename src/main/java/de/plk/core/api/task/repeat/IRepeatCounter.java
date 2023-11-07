package de.plk.core.api.task.repeat;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 18:06
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IRepeatCounter {

    /**
     * Get the current count.
     *
     * @return The current count.
     */
    int currentCounter();

    /**
     * Sets ths current counter.
     *
     * @param counter The new counter value.
     */
    void setCurrentCounter(int counter);

    /**
     * Increment the counter with a specific value.
     *
     * @param count The value to increment.
     */
    void increment(int count);

    /**
     * Decrement the counter with a specific value.
     *
     * @param count The value to decrement.
     */
    void decrement(int count);

}
