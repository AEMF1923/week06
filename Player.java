package week06;

import java.util.List; 
import java.util.ArrayList;

/*

i.	Fields
1.	hand (List of Card)--referring back to card?
2.	score (set to 0 in the constructor)
3.	name
ii.	Methods
1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
2.	flip (removes and returns the top card of the Hand)
3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
4.	incrementScore (adds 1 to the Player’s score field)
*/

public class Player {

	//the fields the lab is asking for is 
	
	private List<Card> hand = new ArrayList<Card>(); //you need to initialize a new list empty list; this new array list is called hand 
	private int score = 0; 
	private String name; 
	
	public Player (String name, int score, List<Card> hand) {
		this.name = name; 
		this.hand = hand; 
		this.score = 0; 
}
	
	
	//remember to set the getters and setters they talk to the other classes within this package 
	
	public String getName() {   // dont forget that the name in line 36 is kinda like a placeholder and doesn't call back to line 25 until line 43 
		return name; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public List<Card> getHand(){
		return hand;
		
	}
	
	public void setHand(List<Card>hand) {
		this.hand =hand; 
	}
	
	public int getScore() {
		return score; 
	}
	
	public void setScore() {
//		this.score = score; 
	}
	
	//*****************Methods for player 
	// describes
	public void describe(Card card) {
		System.out.println(this.name + " has this in the hand: " + this.hand);
}
	// this removes an item from the array list called hand 
	public Card flip() {
		return hand.remove(0);
}
	
   public void  draw(Deck deck) {
	   hand.add(deck.drawDeck()); 
	 
}
   public int keepScore() {
	   return this.score += 1; 
	   
   }
}
