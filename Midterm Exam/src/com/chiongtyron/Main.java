package com.chiongtyron;

import java.util.Random;
import java.lang.Exception;

public class Main {

    public static void main(String[] args) throws Exception {

        CardStack deck = new CardStack();
        Random rand = new Random();

        while (!deck.isEmpty()) {
            System.out.println("------------------------------");
            deck.printDeck();
            System.out.println("------------------------------");
            deck.printInfo();
            System.out.println("------------------------------");

            if (!Prompter.confirm("Would you like to generate a random command: Y/N")) {
                System.out.println("Thanks for playing!");
                return;
            }

            int n = rand.nextInt(5) + 1;
            switch (rand.nextInt(3)) {
                // draws x cards
                case 0:
                    System.out.println("Attempting to Draw " + n + " Cards from deck....");
                    for (int i = 0; i < n; ++i) deck.drawFromActivePile();
                    break;
                // discards x cards from player hand
                case 1:
                    System.out.println("Attempting to Discard " + n + " Cards from player hand....");
                    for (int i = 0; i < n; ++i) deck.discardCard();
                    break;
                // draws x cards from discard pile
                case 2:
                    System.out.println("Attempting to Draw " + n + " Cards from discard pile....");
                    for (int i = 0; i < n; ++i) deck.drawFromDiscardPile();
                    break;
                default:
                    throw new Exception("Invalid random integer");
            }
        }
    }
}