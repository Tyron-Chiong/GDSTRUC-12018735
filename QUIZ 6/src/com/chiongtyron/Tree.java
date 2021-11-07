package com.chiongtyron;

import java.util.*;

public class Tree {

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public int getMin(Node value) {
        if (root == null) {
            System.out.println("The tree is empty");
            return 0;
        }
        int leftMin;
        int rightMin;

        int min = value.getData();

        /** Checks for the least value on the left child. */
        if (value.getLeftChild() != null) {
            leftMin = getMin(value.getLeftChild());
        /** compares who the greater values between the two integers. */
            min = Math.min(min,leftMin);
        }
        /** This checks the right child side for the lowest value. */
        if (value.getRightChild() != null) {
            rightMin = getMin(value.getRightChild());

            min = Math.min(min, rightMin);
        }

        return min;
    }

    public int getMax(Node value) {
        if (root == null) {
            System.out.println("The tree is empty");
            return 0;
        }
        int leftMax;
        int rightMax;

        int max = value.getData();

        /** Checks for the least value on the left child. */
        if (value.getLeftChild() != null) {
            leftMax = getMax(value.getLeftChild());
            /** compares who the greater values between the two integers. */
            max = Math.max(max, leftMax);
        }
        /** This checks the right child side for the lowest value. */
        if (value.getRightChild() != null) {
            rightMax = getMax(value.getRightChild());
            max = Math.max(max, rightMax);
        }
        return max;
    }

    public void traverseInOrderDescending() {
        if (root != null) {
            root.traverseInOrderDescending();
        }
    }

    public Node getRoot() {
        return root;
    }
}
