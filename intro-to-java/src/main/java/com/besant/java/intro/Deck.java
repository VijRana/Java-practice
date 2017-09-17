package com.besant.java.intro;

public class Deck {

	public static final int DECK_SIZE = 52;
	private Card[] cards = new Card[DECK_SIZE];

	public void print() {
		for (int i = 0; i < cards.length; i++)
			System.out.println(cards[i]);
	}
	//
	static double average(int[] values) {
		if (values == null)
			throw new IllegalArgumentException();
		else if (values.length == 0)
			throw new IllegalArgumentException();
		else {
			double sum = 0.0;
			for (int i = 0; i < values.length; i++)
				sum += values[i];
			return sum / values.length;
		}
	}
	
}
