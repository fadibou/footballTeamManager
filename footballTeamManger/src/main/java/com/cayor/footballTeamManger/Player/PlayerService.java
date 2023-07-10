package com.cayor.footballTeamManger.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    List<Player> getPlayer() {
        this.playerRepository.findAll();
        return Arrays.asList(new Player("ttt", "tttt", 2));
        /*return playerRepository.findAll();*/

    }

}
