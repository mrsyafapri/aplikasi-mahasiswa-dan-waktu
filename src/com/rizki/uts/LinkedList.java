package com.rizki.uts;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (this.head == null) && (this.tail == null);
    }

    public void addFirst(Node node) {
        if (!isEmpty()) {
            node.setNextReference(head);
            head = node;
        } else {
            node.setNextReference(null);
            tail = node;
            head = node;
        }
        ++this.size;
    }

    public int getSize() {
        return size;
    }

    public void addLast(Node node) {
        if (!isEmpty()) {
            node.setNextReference(null);
            this.tail.setNextReference(node);
            tail = node;
        } else {
            node.setNextReference(null);
            tail = node;
            head = node;
        }
        ++this.size;
    }

    public void deleteHead() {
        Node pointer;
        pointer = head;
        head = pointer.getNextReference();
        pointer = null;
        --this.size;
    }

    public Node getNode(int index) {
        Node pointer;
        int i;
        if (isEmpty()) {
            return null;
        }
        pointer = head;
        i = 0;
        while (pointer != null) {
            if (i == index) {
                return pointer;
            }
            i++;
            pointer = pointer.getNextReference();
        }
        return null;
    }

    public void display() {
        Node pointer;
        pointer = head;
        System.out.println("Size (Banyak Data): " + this.size);
        if (isEmpty()) {
            System.out.println("- Data Kosong -");
        } else {
            System.out.println("||  NIM \t||  Nama \t||  IPK  ||");
            while (pointer != null) {
                System.out.println(pointer.toString());
                pointer = pointer.getNextReference();
            }
        }
    }
}
