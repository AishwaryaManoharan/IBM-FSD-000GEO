package com.example.springplayer.service;
import com.example.springplayer.repository.*;
import com.example.springplayer.service.*;
import com.example.springplayer.model.League;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LeagueServiceImpl implements LeagueService {

	private LeagueRepository leagueRepository;
	
	
	
	public LeagueServiceImpl(LeagueRepository theLeagueRepository) {
		leagueRepository = theLeagueRepository;
	}
	
	@Override
	public List<League> findAll() {
		return leagueRepository.findAll();
	}

	@Override
	public League findById(int theId) {
		Optional<League> result =leagueRepository.findById(theId);
		
		League theLeague = null;
		
		if (result.isPresent()) {
			theLeague = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find league id - " + theId);
		}
		
		return theLeague;
	}

	@Override
	public void save(League theLeague) {
		leagueRepository.save(theLeague);
	}

	@Override
	public void deleteById(int theId) {
		leagueRepository.deleteById(theId);
	}

}



