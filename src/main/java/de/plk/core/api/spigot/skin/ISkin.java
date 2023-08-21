package de.plk.core.api.spigot.skin;

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
    UUID getUuid();

    /**
     * The name of the user.
     *
     * @return Username.
     */
    String getName();

    /**
     * The texture of the skin.
     *
     * @return Skin texture.
     */
    String getTexture();
}
