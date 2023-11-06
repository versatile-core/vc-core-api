package de.plk.core.api.database.meta;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 15:33
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {

    /**
     * The table name.
     *
     * @return Table name.
     */
    String name();

}
