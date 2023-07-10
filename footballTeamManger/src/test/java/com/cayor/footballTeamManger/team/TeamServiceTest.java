package com.cayor.footballTeamManger.team;

import com.cayor.footballTeamManger.Player.Player;
import com.cayor.footballTeamManger.Player.PlayerRepository;
import com.cayor.footballTeamManger.team.models.Team;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@RunWith(JUnit4.class)
class TeamServiceTest {
    @Mock
    private TeamRepository teamRepository;

    private TeamService teamService;
    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(TeamService.class);
      /*  this.teamRepository.save(new Team("ogc Nice", "OGCN", 50000000));
        playerRepository.save(new Player("terem moffi", "milieu", 1))*/;
        teamService = new TeamService(teamRepository);
    }

/*    @Test
    public void shoulGetTeams(){
        doReturn(Arrays.asList(Arrays.asList("ogc Nice", "OGCN", 50000000,"terem_moffi","milieu,1"))).when(teamRepository.findAllTeams());
        List<Object[]> listObject = teamService.getTeams();
        assertNotNull(listObject);
    }*/

}