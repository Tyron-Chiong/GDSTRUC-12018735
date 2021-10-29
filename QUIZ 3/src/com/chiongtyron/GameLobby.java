package com.chiongtyron;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GameLobby {

    private ArrayDeque<Player> playerList;
    private ArrayDeque<Player> queuePlayer;

    public GameLobby() {

        var playerList = new ArrayDeque<Player>();
        var queuePlayer = new ArrayDeque<Player>();

        playerList.addFirst(new Player(1, "Eva Lambert", 8));
        playerList.addFirst(new Player(2, "Abbie Fowler", 18));
        playerList.addFirst(new Player(3, "Kathy Gardner", 52));
        playerList.addFirst(new Player(4, "Daryl Price", 39));
        playerList.addFirst(new Player(5, "Stephanie Miles", 18));
        playerList.addFirst(new Player(6, "Megan Lane", 30));
        playerList.addFirst(new Player(7, "Kelly Neal", 15));
        playerList.addFirst(new Player(8, "Sam Stanley", 23));
        playerList.addFirst(new Player(9, "Rachel Terry", 14));
        playerList.addFirst(new Player(10,"Barb Graves", 22));
        playerList.addFirst(new Player(11, "Jared Stanley", 15));
        playerList.addFirst(new Player(12, "Richard Little", 44));
        playerList.addFirst(new Player(13, "Victor Shelton", 41));
        playerList.addFirst(new Player(14, "Bobby Kim", 26));
        playerList.addFirst(new Player(15, "Sarah Mason", 49));
        playerList.addFirst(new Player(16, "Kelly Coleman", 19));
        playerList.addFirst(new Player(17, "Taylor Reid", 36));
        playerList.addFirst(new Player(18, "Tristan Ward", 47));
        playerList.addFirst(new Player(19, "Maria Riley", 21));
        playerList.addFirst(new Player(20, "Randy Morrison", 12));
        playerList.addFirst(new Player(21, "Sir Dale", 31));
        playerList.addFirst(new Player(22, "Sir Kevin", 41));
        playerList.addFirst(new Player(23, "Sir Deng", 23));
        playerList.addFirst(new Player(24, "Doc B", 50));
        playerList.addFirst(new Player(25, "John", 31));

        this.playerList = playerList;
        this.queuePlayer = queuePlayer;
    }

    public void printInfo() {
        System.out.println("===============================");
        System.out.println("# available Players: " + playerList.size());
        System.out.println("# queued Players: " + queuePlayer.size());
        System.out.println("===============================");
    }

    public void addPlayerToQueue() {
        queuePlayer.addFirst(playerList.removeFirst());
    }

    public void addPlayerToList(Player player) {
        playerList.addLast(player);
    }

    public ArrayList<Player> commitPlayersToMatch() {
        var players = new ArrayList<Player>();
        for (var i = 0; i < 5; ++i) {
            players.add(queuePlayer.removeFirst());
        }
        return players;
    }

    /** Checks if the queue has 5 players to put into the match. */
    public boolean hasEnoughPlayers() {
        return queuePlayer.size() >= 5;
    }

}
