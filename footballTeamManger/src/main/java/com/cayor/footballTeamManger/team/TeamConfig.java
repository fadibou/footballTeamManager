package com.cayor.footballTeamManger.team;

import com.cayor.footballTeamManger.Player.Player;
import com.cayor.footballTeamManger.Player.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class TeamConfig {
    @Bean
    CommandLineRunner commandLineRunner(TeamRepository teamRepository){
        return args -> {
            Team team = new Team(2,"ogc Nice","OGCN",50000000);
            teamRepository.save(team);
        };
    }
}
