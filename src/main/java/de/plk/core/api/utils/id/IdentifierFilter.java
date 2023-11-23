package de.plk.core.api.utils.id;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;

import java.util.function.Predicate;

/**
 * @author SoftwareBuilds
 * @since 22.11.2023 20:44
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public class IdentifierFilter<E extends IIdentifier> implements Predicate<E> {

    /**
     * The identifier string to test for.
     */
    @Nullable
    private final String identifier;

    /**
     * Construct a identifier predicate test.
     *
     * @param identifier The identifier.
     */
    public IdentifierFilter(@Nullable String identifier) {
        this.identifier = identifier;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean test(@NotNull E element) {
        return element.getIdentifier().equals(identifier);
    }

}
