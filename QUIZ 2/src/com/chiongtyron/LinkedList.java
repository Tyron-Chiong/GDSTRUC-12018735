package com.chiongtyron;

import com.chiongtyron.Node;
import com.chiongtyron.Player;
import java.lang.Exception;

public class LinkedList {
    private Node head;
    private int length = 1;

    public LinkedList(Player first) {
        this.head = new Node(first);
    }

    /** this returns the current length in constant time */
    public int getLength() {
        return length;
    }

    public int prepend(Player item) {

        var dangling = new Node(item);
        if (head == null) {
            head = dangling;
            return ++length;
        }
        dangling.setNext(head);
        head.setPrev(dangling);
        head = dangling;
        return ++length;
    }

    /** Removes the first element from the list. */
    public Player popFront() {
        if (head == null)
            return null;

        Node poppedHead = head;
        var next = poppedHead.getNext();
        if (next != null)
            next.setPrev(null);
        head = next;
        --length;
        return poppedHead.getData();
    }

    /** searches player by ID */
    public boolean contains(int id) {
        var current = head;

        while (current != null) {
            if (current.getData().getId() == id) return true;
            current = current.getNext();
        }
        return false;
    }

    /**
     * searches for the index of the player ID.
     * if we cannot find any node equal to the given ID
     * then we return -1.
     */
    public int indexOf(int id) {
        var currentIndex = 0;
        var currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData().getId() == id) return currentIndex;
            currentNode = currentNode.getNext();
            ++currentIndex;
        }
        return -1;
    }

    public void printAll() {
        var currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getData().getName());
            currentNode = currentNode.getNext();
        }
    }

}
