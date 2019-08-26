package comm.example;

public class Card {
	
	private Suit suit;
	private Rank rank;
	private Hands hand;
	
	public Card()
	{
		
	}

	public Card(Hands hand,Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
		this.hand = hand;
		

	}
	
	public Suit suit()
	{
		return suit;
	}
	
	public Rank rank()
	{
		return rank;
	}
	
	public Hands hand()
	{
		return hand;
	}

	@Override
	public String toString() {
		System.out.println("Working");
		return "Card [hand="+ hand + " suit=" + suit + ", rank=" + rank + "]";
	}

	

	
	


}
