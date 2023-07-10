package com.cayor.footballTeamManger.team.models;


/**
 * team d t o
 */
public class TeamDTO {
    private final Integer budget;
    private final Long id_team;
    private final Long team_id;
    private final String acronym;
    private final String name_team;
    private final Long id_player;
    private final String name_player;
    private final String position;

    public TeamDTO(Integer budget, Long id_team, Long team_id, String acronym, String name_team, Long id_player, String name_player, String position) {
        this.budget = budget;
        this.id_team = id_team;
        this.team_id = team_id;
        this.acronym = acronym;
        this.name_team = name_team;
        this.id_player = id_player;
        this.name_player = name_player;
        this.position = position;
    }
}
