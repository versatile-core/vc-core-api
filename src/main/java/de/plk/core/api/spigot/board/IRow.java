package de.plk.core.api.spigot.board;

import de.plk.core.api.code.NotNull;

/**
 * @author SoftwareBuilds
 * @since 07.08.2023 12:38
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@FunctionalInterface
public interface IRow {

    /**
     * Get the value in the row.
     *
     * @return The value in the row.
     */
    @NotNull
    String getValue();

}
