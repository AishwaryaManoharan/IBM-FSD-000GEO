package comm.example;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.err;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoachTester 
{
	private static Scanner scanner=new Scanner(in);
	
	public static void main(String[] args)
	{
	String name=null;
	try
	{
	out.print("Coach name:");
	name=scanner.next();
	TennisCoach myCoach=new TennisCoach();
	myCoach.createCoach(name,Level.HIGH);
	out.println(myCoach.getCoachDetails().toString());
	}
	catch(InputMismatchException e)
	{
	e.printStackTrace();
	err.println(e.toString());
	}
	}

}
