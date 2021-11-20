package main;

import domain.Deck;

public class Driver {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.toString());

        deck.shuffle();
        System.out.println("Shuffled domain.Deck \n");
        System.out.println(deck);

        for(int i= 0; i < 10;i++){
            System.out.println(deck.deal());
        }
    }
}
