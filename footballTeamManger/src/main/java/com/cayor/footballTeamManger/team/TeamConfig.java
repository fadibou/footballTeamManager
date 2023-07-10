package com.cayor.footballTeamManger.team;

import com.cayor.footballTeamManger.team.models.Team;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeamConfig {
    @Bean
    CommandLineRunner commandLineRunner2(TeamRepository teamRepository) {
        return args -> {
            Team team = new Team("ogc Nice", "OGCN", 50000000);
            teamRepository.save(team);
        };
    }
}
