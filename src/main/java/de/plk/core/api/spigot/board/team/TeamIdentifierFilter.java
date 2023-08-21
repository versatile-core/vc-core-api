package de.plk.core.api.spigot.board.team;

import java.util.function.Predicate;

/**
 * @author SoftwareBuilds
 * @since 09.08.2023 13:27
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public class TeamIdentifierFilter implements Predicate<IScoreboardTeam> {

    /**
     * The team identifier to test for.
     */
    private final String teamIdentifier;

    /**
     * Construct a team identifier predicate test.
     *
     * @param teamIdentifier The team identifier.
     */
    public TeamIdentifierFilter(String teamIdentifier) {
        this.teamIdentifier = teamIdentifier;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean test(IScoreboardTeam scoreboardTeam) {
        return scoreboardTeam.getTeamIdentifier().equals(teamIdentifier);
    }
}
