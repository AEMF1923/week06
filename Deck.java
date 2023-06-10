package week06;

import java.util.ArrayList;
import java.util.Collections; //Found this on the webz, it says that it shuffles stuff. Check on what objects. 
import java.util.List;

/*
 
 i.	Fields
1.	cards (List of Card) This is an array list 

ii.	Methods
1.	shuffle (randomizes the order of the cards)
2.	draw (removes and returns the top card of the Cards field)
3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.

*/

public class Deck {

	private List<Card> cards = new ArrayList<Card>(); //creating a new array list called cards; the private keywords means you have to have getters and setters in order for certain properties to read from this class onto another class
	
	
// the constructor; This will create a new deck of 52 cards...
	
	public Deck () {
		String[] cardName = new String [4];
				 cardName[0] = "Clubs";
				 cardName[1] = "Diamonds";
				 cardName[2] = "Hearts";
				 cardName[3] = "Spades";
				 
        String[] values = new String [14]; //known size of the array
        		 values[0] = null; 
        		 values[1] = "Two"; 
        		 values[2] = "Three"; 
        		 values[3] = "Four"; 
        		 values[4] = "Five"; 
        		 values[5] = "Six"; 
        		 values[6] = "Seven"; 
        		 values[7] = "Eight"; 
        		 values[8] = "Nine";
        		 values[9] = "Ten";
        		 values[10] = "Jack";
        		 values[11] = "Queen";
        		 values[12] = "King";
        		 values[13] = "Ace";
        
        		 
        		 
        		 for (int i = 1; i <= 13; i++) {
        				for (int j = 0; j <= 3; j++) {
        					
        			Card cardNewDeck = new Card(); //declaring a new class instance of card 
        			cardNewDeck.setnameofCard(values[i] + cardName[j]);
        			cardNewDeck.setvalueofCard(i);
        			cards.add(cardNewDeck);
        				}
        				
        			}

	}
    // Getters and Setters...allows other classes to get access to this 
    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
	
    
    // Methods. This is the stuff that we want deck to do 
	
    public void shuffleTheDeck() {
        Collections.shuffle(cards);
}

    public Card drawDeck() {
       return cards.remove(0); //this removes an item from the array 
}
} // end of the class called DECK 
