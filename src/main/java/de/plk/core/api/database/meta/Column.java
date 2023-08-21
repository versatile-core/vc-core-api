package de.plk.core.api.database.meta;

import de.plk.core.api.database.meta.type.DataType;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 15:32
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
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
