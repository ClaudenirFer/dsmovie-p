package com.rinedualc.dsmoviep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rinedualc.dsmoviep.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
