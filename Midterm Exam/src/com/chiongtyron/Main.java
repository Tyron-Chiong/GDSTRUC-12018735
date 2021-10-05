package com.chiongtyron;

import java.util.Random;
import java.lang.Exception;

public class Main {

    public static void main(String[] args) throws Exception {

        CardStack deck = new CardStack();
        Random rand = new Random();

        while (!deck.isEmpty()) {
            System.out.println("------------------------------");
            deck.printPlayerHand();
            System.out.println("------------------------------");
            deck.printInfo();
            System.out.println("------------------------------");

            // a prompter class that prompts the user for an input
            if (!Prompter.confirm("Would you like to generate a random command: Y/N")) {
                System.out.println("Thanks for playing!");
                return;
            }

            int n = rand.nextInt(5) + 1;
            switch (rand.nextInt(3)) {
                // draws x cards
                case 0:
                    System.out.println("Attempting to Draw " + n + " Cards from deck....");
                    if (deck.getDeckSize() >= n) for (int i = 0; i < n; ++i) deck.drawFromActivePile();
                    else System.out.println(Math.min(n, deck.getDeckSize()));
                    break;
                // discards x cards from player hand
                case 1:
                    System.out.println("Attempting to Discard " + n + " Cards from player hand....");
                    if (deck.getPlayerHandSize() >= n) for (int i = 0; i < n; ++i) deck.discardCard();
                    else System.out.println(Math.min(n, deck.getPlayerHandSize()));
                    break;
                // draws x cards from discard pile
                case 2:
                    System.out.println("Attempting to Draw " + n + " Cards from discard pile....");
                    if (deck.getDiscardPileSize() >= n) for (int i = 0; i < n; ++i) deck.drawFromDiscardPile();
                    else System.out.println(Math.min(n, deck.getDiscardPileSize()));
                    break;
                default:
                    throw new Exception("Invalid random integer");
            }
        }
    }
}