package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int score;
	private List<Card> hand;
	
	public Player(String name) {
		this.name = name;
		score = 0;
		hand = new ArrayList<Card>();
	}
	
	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score: " + score);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		if (!hand.isEmpty()) {
			return hand.remove(0);
		} else {
			System.out.println(name + " hand is empty");
			return null;
		}
	}
	
	public void draw(Deck deck) {
		Card card = deck.draw();
		if (card != null) {
			hand.add(card);
		}
	}
	
	public void incrementScore() {
		score++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	
}
