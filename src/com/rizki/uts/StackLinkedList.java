package com.rizki.uts;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class StackLinkedList {

    private final LinkedList elements;
    private static final int MAX_SIZE = 100;
    private int size;

    public StackLinkedList() {
        elements = new LinkedList();
        size = -1;
    }

    public void push(Mahasiswa element) {
        if (isFull()) {
            System.out.println("- Data Penuh -");
        } else {
            Node e = new Node(element);
            elements.addFirst(e);
            size++;
            System.out.println("- PUSH Berhasil -");
        }
    }

    public Mahasiswa pop() {
        if (isEmpty()) {
            System.out.println("- Data Kosong -");
            return null;
        } else {
            Mahasiswa s = peek(); // ambil elemen TOP
            elements.deleteHead();
            size--;
            System.out.println("- POP Berhasil -");
            System.out.println("- Data Mahasiswa dengan nama " + s.getNama() + " Berhasil Dihapus! -");
            return s;
        }
    }

    public Mahasiswa peek() {
        if (isEmpty()) {
            System.out.println("- Data Kosong -");
            return null;
        } else {
            Node e = elements.getNode(0); // ambil node teratas (TOP of Stack)
            return e.getData();
        }
    }

    public boolean isEmpty() {
        return (size == -1);
    }

    public boolean isFull() {
        return (size == MAX_SIZE);
    }

    public void view() {
        if (isEmpty()) {
            System.out.println("- Data Kosong -");
        } else {
            elements.display();
        }
    }

    public void clear() {
        size = -1;
    }
}
