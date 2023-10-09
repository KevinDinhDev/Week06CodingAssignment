package week06;

public class App {

	public static void main(String[] args) {
	
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			System.out.println("Player 1 flipped the " + card1.getName());
			System.out.println("Player 2 flipped the " + card2.getName());
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 won!");
			} else if (card2.getValue() > card1.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 won!");
			} else {
				System.out.println("A draw with no points given!");
			}
		}
		
		System.out.println("The final scores of the players are:");
		System.out.println("Player 1 has a total of: " + player1.getScore() + " points!");
		System.out.println("Player 2 has a total of: " + player2.getScore() + " points!");
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("A tie! No Winners.");
		}
	}

}
