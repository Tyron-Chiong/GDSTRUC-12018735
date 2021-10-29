package com.chiongtyron;

import java.util.ArrayDeque;

public class GameLobby {

    /*  private Player[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = new Player[capacity];

        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(new Player(1, "Bob", 100));
    }

    // adds the item at the end of the queue
    public void enqueue(Player player){
        if (back == queue.length) {
            Player[] newArray = new Player[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = player;
        back++;
    }

    public Player dequeue(){
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Player removedPlayer = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return removedPlayer;
    }

    public Player peek(){
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size(){
        return back - front;
    }

    public void printQueue(){
        for (int i = front; i < back; ++i) {
            System.out.println(queue[i]);
        }
    }*/

    private ArrayDeque<Player> playerList;
    private ArrayDeque<Player> queuePlayer;
    private ArrayDeque<Player> match;

    public GameLobby() {

        var playerList = new ArrayDeque<Player>();
        var queuePlayer = new ArrayDeque<Player>();
        var match = new ArrayDeque<Player>();

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

        this.playerList = playerList;
        this.queuePlayer = queuePlayer;
        this.match = match;
    }

    public void printInfo() {
        System.out.println("# players: " + playerList.size());

    }

    public void addPlayerToQueue() {
        queuePlayer.addFirst(playerList.removeFirst());
    }

    public void addQueuedPlayersToMatch() {
        match.addFirst(queuePlayer.removeFirst());
    }

    /** Checks if the queue has 5 players to put into the match. */
    public boolean hasEnoughPlayers() {
        return queuePlayer.size() >= 5;
    }

    public boolean hasEnoughMatches() {
        return match.size() >= 5;
    }

}
