package de.plk.core.api.entity;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.database.IModel;
import de.plk.core.api.language.ILanguage;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 00:48
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IVersatilePlayer<T> extends IModel {

    /**
     * The game player.
     *
     * @return Game player.
     */
    @NotNull
    T getPlayer();

    /**
     * Get the active player language.
     *
     * @return The language.
     */
    @NotNull
    ILanguage getLanguage();

    /**
     * Set the language for the player.
     *
     * @param language The language.
     */
    void setLanguage(@Nullable ILanguage language);

}
