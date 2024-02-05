package com.bridgelabz.stackandqueue;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}

class Stack{
    LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }

    public void push(int data) {
        linkedList.add(data);
    }

    // Other stack operations like pop, peek, isEmpty can be added here

    public void printStack() {
        Node current = linkedList.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main{
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Print the stack
        System.out.println("Stack after push operations:");
        stack.printStack();
    }
}
