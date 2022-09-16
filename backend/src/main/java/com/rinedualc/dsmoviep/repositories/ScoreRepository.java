package com.rinedualc.dsmoviep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rinedualc.dsmoviep.entities.Score;
import com.rinedualc.dsmoviep.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
