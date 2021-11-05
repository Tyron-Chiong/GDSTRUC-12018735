package com.chiongtyron;

import java.util.Hashtable;

public class PlayerLobby {

    private StoredPlayer[] lobby;

    public PlayerLobby() {

        lobby = new StoredPlayer[25];


    }

    private int hashkey(String key) { return key.length() % lobby.length; }

    public void put(String key, Player player) {
        int hashedKey = hashkey(key);

        if ( isOccupied(hashedKey)) {
            int stopIndex = hashedKey;

            /** Linear probing */
            if (hashedKey == lobby.length - 1){
                hashedKey = 0;
            }
            else {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % lobby.length;
            }
        }

        if (isOccupied(hashedKey)){
            System.out.println("An existing element has already been placed" + hashedKey);
        }
        else {
            lobby[hashedKey] = new StoredPlayer(key, player);
        }

    }

    public Player remove(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }
        Player deletedValue = lobby[hashedKey].value;

        lobby[hashedKey].value = null;

        return deletedValue;
    }

    public Player get(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1){
            return null;
        }

        return lobby[hashedKey].value;
    }

    private  int findKey(String key) {
        int hashedKey = hashkey(key);

        if (lobby[hashedKey] != null && lobby[hashedKey].key.equals(key)) {
            return hashedKey;
        }


        int stopIndex = hashedKey;

        /** Linear probing */
        if (hashedKey == lobby.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex && lobby[hashedKey] != null
                && !lobby[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % lobby.length;
        }

        if (lobby[hashedKey] != null && lobby[hashedKey].key.equals(key)){
            return hashedKey;
        }
        return -1;
    }

    private boolean isOccupied(int index) { return lobby[index] != null; }

    public void printHashtable()
    {
        for (int i = 0; i < lobby.length; i++)
        {
            /** checks and compares the lobby[i].value to being null */
            if (lobby[i].value != null) {
                System.out.println("Element " + i + " " + lobby[i].value.getName());
            }
            else
            {
                System.out.println("Element " + i + " null");
            }
        }
    }
}
