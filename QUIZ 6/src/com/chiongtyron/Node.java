package com.chiongtyron;

import java.util.ArrayDeque;
import java.util.Queue;

public class Node {
    private int data;
    private Node rightChild;
    private Node leftChild;

    public void insert(int value) {

        /** Only accepts unique values */
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new Node(value);
            }
            leftChild.insert(value);
        }

        if (value > data) {
            if (rightChild == null) {
                rightChild = new Node(value);
            }
            rightChild.insert(value);
        }
    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.println("Data: " + data);

        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public void traverseInOrderDescending() {
        if (rightChild != null) {
            rightChild.traverseInOrderDescending();
        }
        System.out.println("Data: " + data);

        if (leftChild != null) {
            leftChild.traverseInOrderDescending();
        }
    }

    public Node get(int value) {
        if (value == data) {
            return this;
        }

        if ( value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        }
        if (rightChild != null) {
            return rightChild.get(value);
        }
        return null;
    }

    public Node(int _data) {
        this.data = _data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
