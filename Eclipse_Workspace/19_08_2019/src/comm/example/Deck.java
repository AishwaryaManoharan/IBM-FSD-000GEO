package comm.example;
import java.util.ArrayList;
import java.util.List;

public class Deck 
{
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
		System.out.println(l);
		//System.out.println("\n");
	}
}

