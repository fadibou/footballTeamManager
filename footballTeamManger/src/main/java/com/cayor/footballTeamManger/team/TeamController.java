package com.cayor.footballTeamManger.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/teams")
public class TeamController {
    TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

/*    @GetMapping
    public List<Team> getTeams(){
        return teamService.getTeams();
    }*/

    @GetMapping
    public List<Object[]> getTeamsDTO() {
        return teamService.getTeams();
    }
}
