package de.plk.core.api.database.meta;

import de.plk.core.api.database.IModel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 15:33
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
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

    enum RelationType {
        ONE_TO_ONE, ONE_TO_MANY, MANY_TO_MANY
    }
}
