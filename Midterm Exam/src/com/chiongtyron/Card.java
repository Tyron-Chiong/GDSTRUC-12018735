package com.chiongtyron;


public class Card {

    private int id;
    private String name;
    private int level;

    public Card(int id, String name, int level){
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getLevel() { return level; }
}
