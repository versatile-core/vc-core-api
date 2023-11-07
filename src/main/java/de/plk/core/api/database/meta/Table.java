package de.plk.core.api.database.meta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 15:33
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {

    /**
     * The table name.
     *
     * @return Table name.
     */
    String name();

}
