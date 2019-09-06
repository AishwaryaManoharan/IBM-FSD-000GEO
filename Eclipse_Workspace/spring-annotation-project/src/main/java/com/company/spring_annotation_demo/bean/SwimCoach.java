package com.company.spring_annotation_demo.bean;

public class SwimCoach implements Coach {
	
	private String email;
	private String teamName;
	
	private FortuneService service;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "test workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return service;
	}

}
