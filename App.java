package week06;

/*

 * WAR the card game
The goal is to be the first player to win all 52 cards

The Deal
The deck is divided evenly, with each player receiving 26 cards, dealt one at a time, face down. Anyone may deal first. Each player places their stack of cards face down, in front of them.

The Play
Each player turns up a card at the same time and the player with the higher card takes both cards and puts them, face down, on the bottom of his stack.

If the cards are the same rank, it is War. Each player turns up one card face down and one card face up. The player with the higher cards takes both piles (six cards).
 If the turned-up cards are again the same rank, each player places another card face down and turns another card face up. The player with the higher card takes all 10 cards, and so on.

How to Keep Score
The game ends when one player has won all the cards.*/

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		//name the players 
		Player p1 = new Player("Scout"); //new instance of the class player called p1 naming it scout 
//		p1.setName("Scout"); 
		
		Player p2 = new Player("Andi"); 
//		p2.setName("Andi");
		
		 //split the deck
		
		for (int i = 0; i <= 26; i++) {
			Card p1Card = p1.flip();
			int p1Value = p1Card.getvalueofCard();
			System.out.println("Player 1's card is ");  
			p1Card.describe();
			Card p2Card = p2.flip();
			int p2Value = p2Card.getvalueofCard();
			System.out.println("Player 2's card is ");
			p2Card.describe();
			System.out.println();
		
		
		//Scoring system reading	
		if(p1Value > p2Value) {
			p1.keepScore();
			System.out.println("Player 1 wins the round!");
			System.out.println("\t-------------------------------");
		}
		else if (p2Value > p1Value) {
			p2.keepScore();
			System.out.println("Player 2 wins the round!");
			System.out.println("\t-------------------------------");
		}
		else {
			System.out.println("It's a tie!");
			System.out.println("\t-------------------------------");
		}	System.out.println();
	}

	}
}
