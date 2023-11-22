package de.plk.core.api.utils;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import de.plk.core.api.config.IConfig;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author SoftwareBuilds
 * @since 08.08.2023 15:08
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IManager<E extends IIdentifier> {

    /**
     * Add an element.
     *
     * @param element The element.
     *
     * @return True if element was added.
     */
    boolean add(E element);

    /**
     * Removes an element.
     *
     * @param element The element.
     *
     * @return True if element was removed.
     */
    boolean remove(E element);

    /**
     * Filter the list of elements.
     *
     * @param filter The filter.
     *
     * @return The filtered results.
     */
    @Nullable
    Stream<E> getByFilter(@NotNull Predicate<E> filter);

    /**
     * Filter the list of elements.
     *
     * @param filter The filter.
     *
     * @return The filtered result.
     */
    @NotNull
    Optional<E> getFirstByFilter(@NotNull Predicate<E> filter);

    /**
     * Filter the list of elements by identifier.
     *
     * @see #getFirstByFilter(Predicate)
     *
     * @param identifier The identifier.
     *
     * @return The filtered result.
     */
    @NotNull
    default Optional<E> getFirstByIdentifier(String identifier) {
        return getFirstByFilter(new IdentifierFilter<>(identifier));
    }

    /**
     * Get all elements.
     *
     * @return The elements.
     */
    @NotNull
    List<E> getAll();

    /**
     * Set the contents of the manager.
     *
     * @param config The loaded config.
     */
    void loadContentFromConfig(@Nullable IConfig<E> config);

}
