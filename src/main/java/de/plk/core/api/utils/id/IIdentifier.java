package de.plk.core.api.utils.id;

import de.plk.core.api.code.NotNull;

/**
 * @author SoftwareBuilds
 * @since 22.11.2023 20:46
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IIdentifier {

    /**
     * Get the identifier.
     *
     * @return The identifier.
     */
    @NotNull
    String getIdentifier();

}
