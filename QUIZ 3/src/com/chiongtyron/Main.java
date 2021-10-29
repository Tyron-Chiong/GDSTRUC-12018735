package com.chiongtyron;

import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        var lobby = new GameLobby();
        var rand = new Random();
        var scanner = new Scanner(System.in);

        for (var i = 1; i <= 10; ++i) {
            System.out.println("Games: " + i);
            while (!lobby.hasEnoughPlayers()) {
                lobby.printInfo();
                System.out.println("Press Enter to continue");
                scanner.nextLine();

                var n = rand.nextInt(7) + 1;
                for (var j = 0; j < n; ++j) {
                    lobby.addPlayerToQueue();
                    System.out.println("Adding...");
                }
            }
            System.out.println("Committing...");
            var matchedPlayers = lobby.commitPlayersToMatch();
            var length = matchedPlayers.size();
            for (var j = 0; j < length; ++j) {
                lobby.addPlayerToList(matchedPlayers.remove(0));
            }
        }
    }
}
