package com.cayor.footballTeamManger.team.models;

import jakarta.persistence.*;

/**
 *  team
 *
 */
@Entity
@Table
public class Team {
    @Id
    @SequenceGenerator(
            name = "team_sequence",
            sequenceName = "team_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "team_sequence")
    private Long idTeam;
    private String nameTeam;
    private String acronym;
    private Integer budget;

    public Team(Long id, String name, String acronym, Integer budget) {
        this.idTeam = id;
        this.nameTeam = name;
        this.acronym = acronym;
        this.budget = budget;
    }

    public Team(String name, String acronym, Integer budget) {
        this.nameTeam = name;
        this.acronym = acronym;
        this.budget = budget;
    }

    public Team() {
    }

    public Long getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Long idTeam) {
        this.idTeam = idTeam;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }
}
