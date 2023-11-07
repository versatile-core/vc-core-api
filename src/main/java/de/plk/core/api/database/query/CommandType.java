package de.plk.core.api.database.query;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 15:27
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public enum CommandType {

    /**
     * Specifies that the query is a select manipulation.
     */
    SELECT,

    /**
     * Specifies that the query is a delete manipulation.
     */
    DELETE,

    /**
     * Specifies that the query is an insert manipulation.
     */
    INSERT,

    /**
     * Specifies that the query is an update manipulation.
     */
    UPDATE

}
