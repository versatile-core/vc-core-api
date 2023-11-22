package de.plk.core.api.task.repeat;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;

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
     * <p>
     * Default set of current counter is zero when null.
     *
     * @param counter The new counter value.
     */
    void setCurrentCounter(@Nullable int counter);

    /**
     * Increment the counter with a specific value.
     *
     * @param count The value to increment.
     */
    void increment(@NotNull int count);

    /**
     * Decrement the counter with a specific value.
     *
     * @param count The value to decrement.
     */
    void decrement(@NotNull int count);

}
