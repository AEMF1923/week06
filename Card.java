package week06;

public class Card {
	
	
	/* The Card class will dictate what a card is and describe it at the very end 
	 * We are defining what a card is in here.
	 * Fields 
	 * 1. value (contains a value from 2-14 representing cards 2-Ace) 
	 * 2. name (e.g. Ace of Diamonds, or Two of Hearts)
	 * Are these considered variables or arrays? It would be easier if its an array I think
	 * T
	 */

	//public static final String[] SuitofCard = {"Clubs", "Diamonds", "Hearts", "Spades"};
	//public static final String[] NumberofCard = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	//declaring the two fields or variables/ not sure why the difference in language 
	
	private String nameofCard;
	private int valueofCard;
	
	//I have to create a constructor which dictates what a card is by using the variables i declared above 
	
	//constructor 
	public Card(int valueofCard, String nameofCard) {
		this.valueofCard = valueofCard; 
		this.nameofCard = nameofCard;
	}
	
	//creating getters and setters. This gives permission for other class objects to access. 
	
	public String getNameOfCard() {
		return nameofCard; 
	}
	
	public void setnameofCard(String nameofCard) {
		this.nameofCard = nameofCard; 
	}
	
	public int getvalueofCard() {
		return valueofCard;
	}
	
	public void setvalueofCard(int valueofCard) {
		this.valueofCard = valueofCard; 
		
	}
	
	//describe the cards; this is a method and you can use elsewhere because it has the key word public infront of it 
	
	public void describe(int valueofCard, String nameofCard) {
		System.out.println("Card name: " + this.nameofCard + "and the value of card: " + this.valueofCard);
	}
} // end of the class called CARD
