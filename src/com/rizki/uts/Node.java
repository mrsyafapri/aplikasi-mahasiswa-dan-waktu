package com.rizki.uts;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class Node {

    private Mahasiswa data;
    private Node nextReference;

    @Override
    public String toString() {
        return "|| " + data.getNim() + " \t|| " + data.getNama() + " \t||  " + data.getIpk() + "  ||";
    }

    public Node(Mahasiswa data) {
        this.data = data;
        this.nextReference = null;
    }

    public Node(Mahasiswa data, Node next) {
        this.data = data;
        this.nextReference = next;
    }

    public Mahasiswa getData() {
        return data;
    }

    public void setData(Mahasiswa data) {
        this.data = data;
    }

    public Node getNextReference() {
        return nextReference;
    }

    public void setNextReference(Node nextReference) {
        this.nextReference = nextReference;
    }
}
