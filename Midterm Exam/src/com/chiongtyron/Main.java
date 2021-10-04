package com.chiongtyron;


public class Main {

    public static void main(String[] args) {

    CardStack deck = new CardStack();

    System.out.println("popping: " + deck.pop().getName());

    deck.printDeck();

    }
}
