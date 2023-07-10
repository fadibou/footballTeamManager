package com.cayor.footballTeamManger.team;

import com.cayor.footballTeamManger.team.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
    @Query(value = "sELECT * FROM TEAM t join PLAYER p on p.team_ID= t.id_team", nativeQuery = true)
    List<Object[]> findAllTeams();
}
