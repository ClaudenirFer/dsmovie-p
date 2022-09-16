package com.rinedualc.dsmoviep.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rinedualc.dsmoviep.dto.MovieDTO;
import com.rinedualc.dsmoviep.dto.ScoreDTO;
import com.rinedualc.dsmoviep.entities.Movie;
import com.rinedualc.dsmoviep.entities.Score;
import com.rinedualc.dsmoviep.entities.User;
import com.rinedualc.dsmoviep.repositories.MovieRepository;
import com.rinedualc.dsmoviep.repositories.ScoreRepository;
import com.rinedualc.dsmoviep.repositories.UserRepository;


@Service 
public class ScoreService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail()); 
		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0.0;
		for (Score s : movie.getScores()) {
			sum = sum + s.getValue();
		}
		
		double media = sum / movie.getScores().size();
		movie.setScore(media);
		movie.setCount(movie.getScores().size());		
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
	}
	
	
}
