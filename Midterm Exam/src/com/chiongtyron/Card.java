package com.chiongtyron;


public class Card {

    private int id;
    private String name;
    private int level;

    // constructor that creates and returns the card info
    public Card(int id, String name, int level){
        this.id = id;
        this.name = name;
        this.level = level;
    }

    // getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getLevel() { return level; }
}
