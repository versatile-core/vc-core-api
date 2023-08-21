package de.plk.core.api.database.query;

import de.plk.core.api.database.IModel;
import de.plk.core.api.database.meta.Column;
import de.plk.core.api.database.meta.Relation;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 15:29
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IQueryBuilder<M extends IModel> {

    /**
     * Set the type of command.
     *
     * @param type The command type.
     *
     * @return The query builder.
     */
    IQueryBuilder<M> setCommandType(CommandType type);

    /**
     * The where clause added to the command.
     *
     * @param column  The column to check to.
     * @param operand The operand for value checking.
     * @param needle  The needle value to check the column.
     *
     * @return The query builder.
     *
     * @param <V> The value type.
     */
    <V> IQueryBuilder<M> where(Column column, Operand operand, V needle);

    /**
     * The or where clause added to the command.
     *
     * @param column  The column to check to.
     * @param operand The operand for value checking.
     * @param needle  The needle value to check the column.
     *
     * @return The query builder.
     *
     * @param <V> The value type.
     */
    <V> IQueryBuilder<M> orWhere(Column column, Operand operand, V needle);

    /**
     * The and where clause added to the command.
     *
     * @param column  The column to check to.
     * @param operand The operand for value checking.
     * @param needle  The needle value to check the column.
     *
     * @return The query builder.
     *
     * @param <V> The value type.
     */
    <V> IQueryBuilder<M> andWhere(Column column, Operand operand, V needle);

    /**
     * Add a relation the query.
     *
     * @param queryBuilder The related query model builder.
     * @param relation     The relation information from the model.
     *
     * @return The query builder.
     *
     * @param <O> The related model type.
     */
    <O extends IModel> IQueryBuilder<M> getRelatedModel(IQueryBuilder<O> queryBuilder, Relation relation);

    /**
     * Build the model query.
     *
     * @return Model query.
     */
    IQuery<M> build();

    enum Operand {
        EQUAL, NON_EQUAL, GREATER, GREATHR_THAN, SMALLER, SMALLER_THAN, LIKE
    }

}