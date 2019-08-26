package comm.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deck2 {

		static List<Card> l=new ArrayList<Card>();
		private static Suit suit;
		private static Rank rank;
		private static Hands hand;
	
		
		
		
		static
		{
			for(Hands h:hand.values())
			{
				for(Suit s:suit.values())
				{
					for(Rank r:rank.values())
					{
						l.add(new Card(h,s,r));
					}
				}
			}
		}
		
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of hands:");
			sc.nextInt();
			
			System.out.println("Enter the number of cards per hand");
			sc.nextInt();
			
			System.out.println(l);
			//System.out.println("\n");
		}
	}



