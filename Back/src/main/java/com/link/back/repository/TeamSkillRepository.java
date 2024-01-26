package com.link.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.link.back.entity.TeamSkill;

public interface TeamSkillRepository extends JpaRepository<TeamSkill, Long> {

	@Query(value = "insert into team_skill (team_id, skill_id) VALUES (skillId, teamId)", nativeQuery = true)
	void saveById(@Param("skillId") Long teamSkill, @Param("teamId") Long teamId);
}
