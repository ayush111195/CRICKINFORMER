package com.CrickInformer.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.CrickInformer.entites.Match;
import com.CrickInformer.repositiories.MatchRepo;

public class MatchServicesImpl implements MatchService {
	
	@Autowired
	private MatchRepo matchRepo;

	@Override
	public List<Match> getAllMatch() {
		
		return this.matchRepo.findAll();
	}

	@Override
	public List<Match> getLiveMatch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> getPointTable() {
		// TODO Auto-generated method stub
		return null;
	}

}
