package com.example.springplayer.service;

import com.example.springplayer.model.League;

import java.util.List;



public interface LeagueService {

	public List<League> findAll();
	
	public League findById(int theId);
	
	public void save(League theLeague);
	
	public void deleteById(int theId);
	
}