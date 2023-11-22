package de.plk.core.api.task.repeat;

import de.plk.core.api.code.NotNull;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 19:41
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@FunctionalInterface
public interface IRepeatingRunnable {

    /**
     * Content for the repeating task execution.
     *
     * @param counter The repeating counter.
     */
    void run(@NotNull IRepeatCounter counter);

}
