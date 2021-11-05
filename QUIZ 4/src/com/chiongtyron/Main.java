package com.chiongtyron;

public class Main {

    public static void main(String[] args) {

        var lobby = new PlayerLobby();

        lobby.put("Player 1", new Player(1, "Eva Lambert", 8));
        lobby.put("Player 2", new Player(2, "Abbie Fowler", 18));
        lobby.put("Player 3", new Player(3, "Kathy Gardner", 52));
        lobby.put("Player 4", new Player(4, "Daryl Price", 39));
        lobby.put("Player 5", new Player(5, "Stephanie Miles", 18));
        lobby.put("Player 6", new Player(6, "Megan Lane", 30));
        lobby.put("Player 7", new Player(7, "Kelly Neal", 15));
        lobby.put("Player 8", new Player(8, "Sam Stanley", 23));
        lobby.put("Player 9", new Player(9, "Rachel Terry", 14));
        lobby.put("Player 10", new Player(10,"Barb Graves", 22));
        lobby.put("Player 11", new Player(11, "Jared Stanley", 15));
        lobby.put("Player 12", new Player(12, "Richard Little", 44));
        lobby.put("Player 13", new Player(13, "Victor Shelton", 41));
        lobby.put("Player 14", new Player(14, "Bobby Kim", 26));
        lobby.put("Player 15", new Player(15, "Sarah Mason", 49));
        lobby.put("Player 16", new Player(16, "Kelly Coleman", 19));
        lobby.put("Player 17", new Player(17, "Taylor Reid", 36));
        lobby.put("Player 18", new Player(18, "Tristan Ward", 47));
        lobby.put("Player 19", new Player(19, "Maria Riley", 21));
        lobby.put("Player 20", new Player(20, "Randy Morrison", 12));
        lobby.put("Player 21", new Player(21, "Sir Dale", 31));
        lobby.put("Player 22", new Player(22, "Sir Kevin", 41));
        lobby.put("Player 23", new Player(23, "Sir Deng", 23));
        lobby.put("Player 24", new Player(24, "Doc B", 50));
        lobby.put("Player 25", new Player(25, "John", 31));


        lobby.printHashtable();
        System.out.println("===================");
        System.out.println(lobby.get("Player 21").getName());
        System.out.println("===================");
        System.out.println("Player " + lobby.remove("Player 20").getName() + " has been deleted.");
        System.out.println("===================");
        System.out.println("Updated list:");
        lobby.printHashtable();

    }
}
