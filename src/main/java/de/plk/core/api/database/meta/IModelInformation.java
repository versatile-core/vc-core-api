package de.plk.core.api.database.meta;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 15:34
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IModelInformation {

    /**
     * The columns in a model.
     *
     * @return The model columns.
     */
    Set<Column> getColumns();

    /**
     * The table of a model.
     *
     * @return The model table.
     */
    Table getTable();

    /**
     * The relations in a model.
     *
     * @return The model relation.
     */
    Set<Relation> getRelations();

    /**
     * Get field from relation.
     *
     * @param relation The relation.
     *
     * @return The field of relation.
     */
    Field getFieldFromRelation(Relation relation);

}
