package com.dvsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.dsmovie.entities.User;

public interface ScoreRepository extends JpaRepository<User, Long> {
	
	

}
