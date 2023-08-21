package de.plk.core.api.spigot.board;

/**
 * @author SoftwareBuilds
 * @since 07.08.2023 12:38
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@FunctionalInterface
public interface IRow {

    /**
     * The value in the row.
     *
     * @return The value.
     */
    String getValue();

}
