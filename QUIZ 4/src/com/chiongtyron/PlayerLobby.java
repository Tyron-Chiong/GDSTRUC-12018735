package com.chiongtyron;

import java.util.Hashtable;

public class PlayerLobby {


    private Hashtable<String, Player> playerList;

    public PlayerLobby() {

        var playerList = new Hashtable<String, Player>();

        playerList.put("Player 1", new Player(1, "Eva Lambert", 8));
        playerList.put("Player 2", new Player(2, "Abbie Fowler", 18));
        playerList.put("Player 3", new Player(3, "Kathy Gardner", 52));
        playerList.put("Player 4", new Player(4, "Daryl Price", 39));
        playerList.put("Player 5", new Player(5, "Stephanie Miles", 18));
        playerList.put("Player 6", new Player(6, "Megan Lane", 30));
        playerList.put("Player 7", new Player(7, "Kelly Neal", 15));
        playerList.put("Player 8", new Player(8, "Sam Stanley", 23));
        playerList.put("Player 9", new Player(9, "Rachel Terry", 14));
        playerList.put("Player 10", new Player(10,"Barb Graves", 22));
        playerList.put("Player 11", new Player(11, "Jared Stanley", 15));
        playerList.put("Player 12", new Player(12, "Richard Little", 44));
        playerList.put("Player 13", new Player(13, "Victor Shelton", 41));
        playerList.put("Player 14", new Player(14, "Bobby Kim", 26));
        playerList.put("Player 15", new Player(15, "Sarah Mason", 49));
        playerList.put("Player 16", new Player(16, "Kelly Coleman", 19));
        playerList.put("Player 17", new Player(17, "Taylor Reid", 36));
        playerList.put("Player 18", new Player(18, "Tristan Ward", 47));
        playerList.put("Player 19", new Player(19, "Maria Riley", 21));
        playerList.put("Player 20", new Player(20, "Randy Morrison", 12));
        playerList.put("Player 21", new Player(21, "Sir Dale", 31));
        playerList.put("Player 22", new Player(22, "Sir Kevin", 41));
        playerList.put("Player 23", new Player(23, "Sir Deng", 23));
        playerList.put("Player 24", new Player(24, "Doc B", 50));
        playerList.put("Player 25", new Player(25, "John", 31));


        this.playerList = playerList;

    }
}
