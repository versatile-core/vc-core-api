package de.plk.core.api.database.query;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.database.IModel;
import de.plk.core.api.database.meta.Column;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 15:29
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IQueryBuilder<M extends IModel> {

    /**
     * Set the type of command.
     * <p>
     * The default command type is SELECT.
     *
     * @param type The command type.
     *
     * @return The query builder.
     */
    @NotNull
    IQueryBuilder<M> setCommandType(@Nullable CommandType type);

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
    @NotNull
    <V> IQueryBuilder<M> where(@NotNull Column column, @Nullable Operand operand, @NotNull V needle);

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
    @NotNull
    <V> IQueryBuilder<M> orWhere(@NotNull Column column, @Nullable Operand operand, @NotNull V needle);

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
    @NotNull
    <V> IQueryBuilder<M> andWhere(@NotNull Column column, @Nullable Operand operand, @NotNull V needle);

    /**
     * Build the model query.
     *
     * @return Model query.
     */
    @NotNull
    IQuery<M> build();

    /**
     * The enum with different options to check the values.
     */
    enum Operand {

        /**
         * Uses for equality check.
         */
        EQUAL,

        /**
         * Uses for non equality check.
         */
        NON_EQUAL,

        /**
         * Uses for greater check.
         */
        GREATER,

        /**
         * Uses for greater than check.
         */
        GREATER_THAN,

        /**
         * Uses for smaller check.
         */
        SMALLER,

        /**
         * Uses for smaller than check.
         */
        SMALLER_THAN,

        /**
         * Uses for like check.
         */
        LIKE
    }

}
