package com.CrickInformer.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.CrickInformer.entites.Match;

@Service
public interface MatchService  {

	//get all match
	
	List<Match>getAllMatch( );
		
    //get all live match 
	
	List<Match>getLiveMatch();

	
   //get cwc2023 point table
	
	List<Map<String,String >>getPointTable();
}
