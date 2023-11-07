package de.plk.core.api.database.meta;

import de.plk.core.api.database.IModel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 15:33
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Relation {

    /**
     * The foreign table column name.
     *
     * @return Foreign table name.
     */
    Class<? extends IModel> foreignModel();

    /**
     * The foreign key column name.
     *
     * @return Foreign column name.
     */
    Column foreignColumn();

    /**
     * The relation type.
     *
     * @return Relation type.
     */
    RelationType relationType();

    /**
     * Set the logical relation type to another table.
     */
    enum RelationType {

        /**
         * Defines that a table references another table.
         */
        ONE_TO_ONE,

        /**
         * Defines that a table references several other tables.
         */
        ONE_TO_MANY,

        /**
         * Defines that several tables are referenced to several tables.
         */
        MANY_TO_MANY
    }

}
