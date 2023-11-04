package de.plk.core.api.database;

import de.plk.core.api.database.meta.Column;
import de.plk.core.api.database.meta.IModelInformation;
import de.plk.core.api.database.meta.Relation;
import de.plk.core.api.database.meta.Table;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
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
    static IModelInformation getModelInformation(Class<? extends IModel> modelClass) {
        return new IModelInformation() {

            @Override
            public Set<Column> getColumns() {
                Set<Column> columns = new HashSet<>();

                if (modelClass.isAnnotationPresent(Column.class)) {
                    Arrays.stream(modelClass.getAnnotationsByType(Column.class)).forEach(columns::add);
                }

                return columns;
            }

            @Override
            public Table getTable() {
                if (modelClass.isAnnotationPresent(Table.class))
                    return modelClass.getAnnotation(Table.class);

                return null;
            }

            @Override
            public Set<Relation> getRelations() {
                Set<Relation> relations = new HashSet<>();

                if (modelClass.isAnnotationPresent(Relation.class)) {
                    Arrays.stream(modelClass.getAnnotationsByType(Relation.class)).forEach(relations::add);
                }

                return relations;
            }

            @Override
            public Field getFieldFromRelation(Relation relation) {
                for (Field declaredField : modelClass.getDeclaredFields()) {
                    if (declaredField.isAnnotationPresent(Relation.class)) {
                        Relation fieldAnnotation = declaredField.getAnnotation(Relation.class);

                        if (fieldAnnotation == relation) {
                            return declaredField;
                        }
                    }
                }

                return null;
            }
        };
    }

}
