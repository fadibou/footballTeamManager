package com.cayor.footballTeamManger.Player;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
@Table
public class Player {
    @Id
    private Integer playerId;
    private String name;
    private String position;
    private Integer teamId;

    public Player(Integer playerId, String name, String position, Integer teamId) {
        this.playerId = playerId;
        this.name = name;
        this.position = position;
        this.teamId = teamId;
    }
}
