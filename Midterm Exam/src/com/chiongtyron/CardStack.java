package com.chiongtyron;

import java.util.LinkedList;

public class CardStack {

    private LinkedList<Card> deck;

    public CardStack() {
        var deck = new LinkedList<Card>();

        deck.add(new Card(1, "Tyron Chiong", 5));
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
    }

}
