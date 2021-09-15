package com.chiongtyron;

public class Node {
    private Player data;
    private Node next = null;
    private Node prev = null;

    public Node(Player data) {
        this.data = data;
    }

    public void setNext(Node next) { this.next = next; }

    public void setPrev(Node prev) { this.prev = prev; }

    public Node getNext() { return next; }
    public Player getData() { return data; }
}
