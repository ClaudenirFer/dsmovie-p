package com.rinedualc.dsmoviep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.rinedualc.dsmoviep.entities.Score;
//import com.rinedualc.dsmoviep.entities.ScorePK;
import com.rinedualc.dsmoviep.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	/* Busca pelo email*/
	User findByEmail(String email);
}
