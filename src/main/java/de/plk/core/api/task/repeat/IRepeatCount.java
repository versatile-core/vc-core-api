package de.plk.core.api.task.repeat;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 18:06
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IRepeatCount {

    int currentCount();

    void setCount(int count);

    void increment();

    void decrement();

}
