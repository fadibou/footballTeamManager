package com.cayor.footballTeamManger.team;

import org.springframework.data.annotation.Id;

public class Team {
    @Id
    private Integer teamId;
    private String name;
    private String acronym;
    private Integer budget;

    public Team(int teamId, String name, String acronym, Integer budget) {
        this.teamId = teamId;
        this.name = name;
        this.acronym = acronym;
        this.budget = budget;
    }
}
