package de.plk.core.api.database.meta;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 15:33
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public @interface Relation {

    /**
     * The foreign table column name.
     *
     * @return Foreign table name.
     */
    Table foreignTable();

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
