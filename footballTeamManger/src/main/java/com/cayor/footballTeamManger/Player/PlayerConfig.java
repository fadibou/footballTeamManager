package com.cayor.footballTeamManger.Player;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class PlayerConfig {
    @Bean
    CommandLineRunner commandLineRunner(PlayerRepository playerRepository){
        return args -> {
            Player khephren = new Player(null,"khéphren Thuram","milieu",1);
            Player terem = new Player(null,"terem moffi","milieu",1);
            playerRepository.saveAll(Arrays.asList(khephren,terem));
        };
    }
}
