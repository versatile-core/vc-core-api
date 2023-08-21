package de.plk.core.api.database;

import de.plk.core.api.database.meta.Column;
import de.plk.core.api.database.meta.IModelInformation;
import de.plk.core.api.database.meta.Relation;
import de.plk.core.api.database.meta.Table;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 22:53
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IModel {

    /**
     * Get the model information.
     *
     * @return The model information.
     */
    static IModelInformation getModelInformation(Class<? extends IModel> modelClass) {
        return new IModelInformation() {

            @Override
            public Set<Column> getColumns() {
                return null;
            }

            @Override
            public Table getTable() {
                return null;
            }

            @Override
            public Set<Relation> getRelations() {
                return null;
            }

            @Override
            public Field getFieldFromRelation() {
                return null;
            }
        };
    }

}
