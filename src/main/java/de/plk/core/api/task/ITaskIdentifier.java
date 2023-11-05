package de.plk.core.api.task;

import org.bukkit.scheduler.BukkitTask;

/**
 * @author SoftwareBuilds
 * @since 05.11.2023 18:00
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface ITaskIdentifier {

    /**
     * The registered name of the task.
     *
     * @return The registration name.
     */
    String getTaskName();

    /**
     * Get the task.
     *
     * @return The task.
     */
    BukkitTask getTask();

}
