package domain;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> hand = new ArrayList<Card>();

    public Deck(){
        initialise();
    }

    private void initialise(){
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                hand.add(new Card(rank, suit));
            }
        }

    }


    public void shuffle(){
        ArrayList<Card> shuffledHand = new ArrayList<Card>();
        Random generator = new Random();
        int index=-1;

        while(hand.size() > 1){
            index = generator.nextInt(hand.size()-1);
            Card removedCard = hand.remove(index);
            shuffledHand.add(removedCard);
        }
        shuffledHand.add(hand.remove(0));
        hand = shuffledHand;
    }


    public Card deal(){
        return hand.remove(0);
    }


    public String toString(){
        StringBuilder deck = new StringBuilder();
        for(Card card : hand){
            deck.append(card.toString() + "\n");
        }
        return deck.toString();
    }

}
