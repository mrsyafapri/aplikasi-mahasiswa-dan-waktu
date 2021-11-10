package com.rizki.uts;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class QueueLinkedList {

    private final LinkedList elements;
    private static final int MAX_SIZE = 100;
    private int size;

    public QueueLinkedList() {
        elements = new LinkedList();
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return (size == MAX_SIZE);
    }

    public void enqueue(Mahasiswa newElement) {
        if (isFull()) {
            System.out.println("- Data Penuh -");
        } else {
            Node newNode = new Node(newElement);
            elements.addLast(newNode);
            size++;
            System.out.println("- ENQUEUE Berhasil -");
        }
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("- Data Kosong -");
            return null;
        } else {
            Mahasiswa frontElement = elements.getNode(0).getData(); // get front node;
            elements.deleteHead(); // delete front node
            size--;
            System.out.println("- DEQUEUE Berhasil -");
            System.out.println("- Data Mahasiswa dengan nama " + frontElement.getNama() + " Berhasil Dihapus! -");
            return frontElement;
        }
    }

    public Mahasiswa peek() {
        if (isEmpty()) {
            System.out.println("- Data Kosong -");
            return null;
        } else {
            Mahasiswa frontElement = elements.getNode(0).getData(); // get front node
            return frontElement;
        }
    }

    public void view() {
        if (isEmpty()) {
            System.out.println("- Data Kosong -");
        } else {
            elements.display();
        }
    }

    public void clear() {
        size = 0;
    }
}
