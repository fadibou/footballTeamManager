package com.cayor.footballTeamManger.Player;

import com.cayor.footballTeamManger.team.TeamRepository;
import com.cayor.footballTeamManger.team.models.Team;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class PlayerConfig {
    /**
     *
     * @param playerRepository
     * @param teamRepository
     * @return
     */
    @Bean
    CommandLineRunner commandLineRunner(PlayerRepository playerRepository, TeamRepository teamRepository) {
        return args -> {
            Player khephren = new Player("khéphren Thuram", "milieu", 1);
            Player terem = new Player("terem moffi", "milieu", 1);
            Player terem2 = new Player("terem moffi", "milieu", 1);
            playerRepository.saveAll(Arrays.asList(khephren, terem, terem2));
            Team team = new Team("ogc Nice", "OGCN", 50000000);
            teamRepository.save(team);
        };
    }
}
