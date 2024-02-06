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
    Node tail;


    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }


class Stack {
    LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }

    public void push(int data) {
        linkedList.add(data);
    }

    public int peek() {
        if (linkedList.head != null) {
            return linkedList.head.data;
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public int pop() {
        if (linkedList.head != null) {
            int data = linkedList.head.data;
            linkedList.head = linkedList.head.next;
            return data;
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public boolean isEmpty() {
        return linkedList.head == null;
    }

    public void printStack() {
        Node current = linkedList.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

class Queue {
    LinkedList linkedList;

    public Queue() {
        this.linkedList = new LinkedList();
    }

    public void enqueue(int data) {
        linkedList.append(data);
    }

    // Other queue operations like dequeue, front, isEmpty can be added here

    public void printQueue() {
        Node current = linkedList.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}



public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Print the stack
        System.out.println("Stack after push operations:");
        stack.printStack();

        // Peek and pop until the stack is empty
        System.out.println("Peek: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }

        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Print the queue
        System.out.println("Queue after enqueue operations:");
        queue.printQueue();


    }
}
