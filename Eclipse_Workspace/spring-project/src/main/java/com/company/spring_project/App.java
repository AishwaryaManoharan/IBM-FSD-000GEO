package com.company.spring_project;

/**
 * Hello world!
 *
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.spring_project.bean.BaseballCoach;
import com.company.spring_project.bean.Coach;
import com.company.spring_project.bean.CricketCoach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	
        	
			ClassPathXmlApplicationContext context=new 
        			ClassPathXmlApplicationContext("applicationContext.xml");
			Coach theCoach=context.getBean("theCoach",Coach.class);
        	System.out.println(theCoach.getDailyWorkout()+" "+theCoach.getDailyFortune());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}