package de.plk.core.api.database.query;

import de.plk.core.api.database.IModel;

/**
 * @author SoftwareBuilds
 * @since 05.08.2023 22:55
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IQuery<M extends IModel> {

    /**
     * The type of the command.
     * e.q.: INSERT, DELETE, etc.
     *
     * @return Type of command.
     */
    CommandType getCommandType();

    /**
     * The full built sql command.
     *
     * @return The built sql command.
     */
    String getCommand();

    /**
     * The state if this query is an update or query.
     *
     * @return Query or update check state.
     */
    boolean isUpdate();

    /**
     * Execute the query.
     */
    void execute();

    /**
     * The resulted model
     *
     * @return Resulted model.
     */
    M getResult();

}
