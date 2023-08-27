package de.plk.core.api.entity;

import de.plk.core.api.database.IModel;
import de.plk.core.api.language.ILanguage;
import de.plk.core.api.spigot.skin.ISkin;

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
    T getPlayer();

    /**
     * Get the active player language.
     *
     * @return The language.
     */
    ILanguage getLanguage();

    /**
     * Set the language for the player.
     *
     * @param language The language.
     */
    void setLanguage(ILanguage language);

    /**
     * The players skin.
     *
     * @return The player skin.
     */
    ISkin getSkin();

    /**
     * Set the players skin.
     *
     * @param skin Players skin.
     */
    void setSkin(ISkin skin);

}
