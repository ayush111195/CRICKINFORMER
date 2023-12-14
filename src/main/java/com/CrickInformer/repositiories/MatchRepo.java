package com.CrickInformer.repositiories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CrickInformer.entites.Match;


public interface MatchRepo extends JpaRepository<Match,Integer> {
// match ko fetch karna chahta hoon-->>
	//provide kar de teamHeading-->
	
	Optional<Match> findByTeamHeading(String teamHeading);
	
}
