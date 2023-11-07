package de.plk.core.api.database.meta;

import de.plk.core.api.database.meta.type.DataType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 15:32
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

    /**
     * The column name.
     *
     * @return Column name.
     */
    String name();

    /**
     * The data type of column.
     *
     * @return Data type of column.
     */
    DataType dataType();

    /**
     * Information of primary key status.
     *
     * @return Is a primary key or not.
     */
    boolean primary() default false;

    /**
     * Information of foreign key status.
     *
     * @return Is a foreign key or not.
     */
    boolean foreign() default false;

}
