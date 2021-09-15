package com.chiongtyron;

import com.chiongtyron.LinkedList;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(5, "Asuna", 5);
        Player lethalBacon = new Player(10, "Lethalbacon", 50);
        Player hpDeskjet = new Player(20, "HPDeskjet", 62);
        Player heathCliff = new Player(45, "Heathcliff", 62);

        var linkedList = new LinkedList(asuna);
        linkedList.prepend(lethalBacon);
        linkedList.prepend(hpDeskjet);
        linkedList.prepend(heathCliff);

        linkedList.printAll();
        System.out.println("---------------------");
        System.out.println(linkedList.contains(10));
        System.out.println(linkedList.indexOf(20));
        System.out.println("---------------------");
        System.out.println(linkedList.contains(10));
        System.out.println(linkedList.indexOf(4));
        System.out.println("---------------------");
        System.out.println(linkedList.popFront().getName());
        System.out.println("---------------------");
        System.out.println("Updated LinkedList");
        System.out.println("---------------------");
        linkedList.printAll();
    }
}
