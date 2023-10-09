package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven",
				"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (int i = 0; i < 13; i++) {
				Card card = new Card(i + 2, numbers[i] + " of " + suit);
				this.cards.add(card);
			}
		}
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		return this.cards.remove(0);
	}
	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}	
}
