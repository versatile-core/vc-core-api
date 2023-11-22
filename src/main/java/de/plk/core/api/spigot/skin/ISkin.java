package de.plk.core.api.spigot.skin;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;

import java.util.UUID;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 00:49
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface ISkin {

    /**
     * The uuid of the player from the skin.
     *
     * @return The uuid of players skin.
     */
    @Nullable
    UUID getUuid();

    /**
     * The name of the user.
     *
     * @return Username.
     */
    @Nullable
    String getName();

    /**
     * The texture of the skin.
     *
     * @return Skin texture.
     */
    @NotNull
    String getTexture();

}
