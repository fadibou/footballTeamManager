package com.cayor.footballTeamManger.Player;

import jakarta.persistence.*;


@Entity
@Table
public class Player {
    @Id
    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "player_sequence")
    private Long idPlayer;
    private String namePlayer;
    private String position;
    private Integer teamId;

    /**
     *
     * @param playerId
     * @param namePlayer
     * @param position
     * @param teamId
     */
    public Player(Long playerId, String namePlayer, String position, Integer teamId) {
        this.idPlayer = playerId;
        this.namePlayer = namePlayer;
        this.position = position;
        this.teamId = teamId;
    }

    public Player(String namePlayer, String position, Integer teamId) {
        this.namePlayer = namePlayer;
        this.position = position;
        this.teamId = teamId;
    }

    public Player() {
    }

    public Long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
}

