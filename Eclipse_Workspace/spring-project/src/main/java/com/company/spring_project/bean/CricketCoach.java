package com.company.spring_project.bean;

public class CricketCoach implements Coach {
	
	public FortuneService fortuneservice;
	
	public CricketCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public CricketCoach(FortuneService fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}



	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket-coach : practice 5k running today";
	}
	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getDailyFortuneService();
	}

	
	

}
