package com.example.springplayer.controller;
import com.example.springplayer.service.*;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springplayer.model.League;


@Controller
@RequestMapping("/leagues")
public class LeagueController {

	private LeagueService leagueService;
	
	public LeagueController(LeagueService theLeagueService) {
		leagueService = theLeagueService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listLeagues(Model theModel) {
		
		// get employees from db
		List<League> theLeagues = leagueService.findAll();
		
		// add to the spring model
		theModel.addAttribute("leagues", theLeagues);
		
		return "leagues/list-leagues";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		League theLeague=new League();
		
		theModel.addAttribute("league", theLeague);
		
		return "leagues/league-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") League theLeague) {
		
		// save the employee
		leagueService.save(theLeague);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/leagues/list";
	}
	
	
}

