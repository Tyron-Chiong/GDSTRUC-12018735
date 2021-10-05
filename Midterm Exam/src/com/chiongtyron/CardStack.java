package com.chiongtyron;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class CardStack {

    // creates a list of cards for the player's deck and discard pile.
    private LinkedList<Card> deck;
    private LinkedList<Card> playerHand;
    private LinkedList<Card> discardPile;

    public CardStack() {
        var deck = new LinkedList<Card>();
        var playerHand = new LinkedList<Card>();
        var discardPile = new LinkedList<Card>();

        deck.add(new Card(1, "Tyron", 5));
        deck.add(new Card(2, "Basti", 11));
        deck.add(new Card(3, "Xyrus", 14));
        deck.add(new Card(4, "Diego", 41));
        deck.add(new Card(5, "Paolo", 17));
        deck.add(new Card(6, "Eva Lambert", 8));
        deck.add(new Card(7, "Abbie Fowler", 18));
        deck.add(new Card(8, "Kathy Gardner", 52));
        deck.add(new Card(9, "Daryl Price", 39));
        deck.add(new Card(10, "Stephanie Miles", 18));
        deck.add(new Card(11, "Megan Lane", 30));
        deck.add(new Card(12, "Kelly Neal", 15));
        deck.add(new Card(13, "Sam Stanley", 23));
        deck.add(new Card(14, "Rachel Terry", 14));
        deck.add(new Card(15, "Barb Graves", 22));
        deck.add(new Card(16, "Jared Stanley", 15));
        deck.add(new Card(17, "Richard Little", 44));
        deck.add(new Card(18, "Victor Shelton", 41));
        deck.add(new Card(19, "Bobby Kim", 26));
        deck.add(new Card(20, "Sarah Mason", 49));
        deck.add(new Card(21, "Kelly Coleman", 19));
        deck.add(new Card(22, "Taylor Reid", 36));
        deck.add(new Card(23, "Tristan Ward", 47));
        deck.add(new Card(24, "Maria Riley", 21));
        deck.add(new Card(25, "Randy Morrison", 12));
        deck.add(new Card(26, "Sir Dale", 31));
        deck.add(new Card(27, "Sir Kevin", 41));
        deck.add(new Card(28, "Sir Deng", 23));
        deck.add(new Card(29, "Doc B", 50));
        deck.add(new Card(30, "John", 31));

        this.deck = deck;
        this.playerHand = playerHand;
        this.discardPile = discardPile;
    }

    /// prints the amount of cards for the player's deck and discarded pile
    public void printInfo() {
        System.out.println("# player deck cards: " + deck.size());
        System.out.println("# discard cards: " + discardPile.size());
    }

    /// returns if the deck is empty
    public boolean isEmpty() { return deck.isEmpty(); }

    /// Pops from the deck and adds to the player's hand
    /// note: it will try and catch the exception if the deck is empty
    public void drawFromActivePile() {
        try{
            playerHand.add(deck.pop());
        } catch(NoSuchElementException ex) {
            System.out.println("Player Deck Empty");
        }
    }

    /// Pops from the player hand and adds to discard pile
    /// also throws an exception when deck is empty
    public void discardCard() {
        try{
            discardPile.add(playerHand.pop());
        } catch (NoSuchElementException ex) {
            System.out.println("Player Hand empty");
        }
    }

    /// Pops discard pile and adds to player hand
    /// also throws an exception when deck is empty
    public void drawFromDiscardPile() {
        try {
            playerHand.add(discardPile.pop());
        } catch (NoSuchElementException ex) {
            System.out.println("Discard Pile empty");
        }
    }

    /// prints the player's hand and card info
    public void printPlayerHand() {
        System.out.println("Remaining deck of cards:");
        for (Card card : playerHand)
            System.out.println("Id:" + card.getId() + " Name:[" + card.getName() + "] Level:" + card.getLevel());
    }

    // getters
    public int getDeckSize() { return deck.size(); }
    public int getPlayerHandSize() { return playerHand.size(); }
    public int getDiscardPileSize() { return discardPile.size(); }
}
