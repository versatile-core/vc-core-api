package de.plk.core.api.database;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.database.meta.Column;
import de.plk.core.api.database.meta.IModelInformation;
import de.plk.core.api.database.meta.Relation;
import de.plk.core.api.database.meta.Table;

import java.util.Arrays;
import java.util.HashSet;
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
    @NotNull
    static IModelInformation getModelInformation(@NotNull Class<? extends IModel> modelClass) {
        return new IModelInformation() {

            /**
             * {@inheritDoc}
             */
            @Override
            public Set<Column> getColumns() {
                Set<Column> columns = new HashSet<>();

                if (modelClass.isAnnotationPresent(Column.class)) {
                    columns.addAll(Arrays.asList(modelClass.getAnnotationsByType(Column.class)));
                }

                return columns;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public Table getTable() {
                if (modelClass.isAnnotationPresent(Table.class))
                    return modelClass.getAnnotation(Table.class);

                return null;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public Set<Relation> getRelations() {
                Set<Relation> relations = new HashSet<>();

                if (modelClass.isAnnotationPresent(Relation.class)) {
                    relations.addAll(Arrays.asList(modelClass.getAnnotationsByType(Relation.class)));
                }

                return relations;
            }
        };
    }

}
