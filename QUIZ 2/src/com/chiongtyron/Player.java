package com.chiongtyron;

public class Player {
    private int id;
    private String player;
    private int level;

    public Player(int id, String player, int level){
        this.id = id;
        this.player = player;
        this.level = level;
    }

    public int getId() { return id; }
    public String getName() { return player; }
    public int getLevel() { return level; }
}
