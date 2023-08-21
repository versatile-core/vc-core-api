package de.plk.core.api.utils;

import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author SoftwareBuilds
 * @since 08.08.2023 15:08
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public interface IManager<E> {

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
    Stream<E> getByFilter(Predicate<E> filter);

    /**
     * Filter the list of elements.
     *
     * @param filter The filter.
     *
     * @return The filtered result.
     */
    E getFirstByFilter(Predicate<E> filter);

    /**
     * Get all elements.
     *
     * @return The elements.
     */
    Set<E> getAll();

}
