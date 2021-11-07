package com.chiongtyron;

public class Main {

    public static void main(String[] args) {


        var tree = new Tree();

        tree.insert(10);
        tree.insert(25);
        tree.insert(28);
        tree.insert(-7);
        tree.insert(16);
        tree.insert(45);
        tree.insert(36);
        tree.insert(4);

        //tree.traverseInOrder();
        System.out.println(tree.get(28));

    }
}
