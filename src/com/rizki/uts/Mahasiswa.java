package com.rizki.uts;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class Mahasiswa {

    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.ipk = 0.00;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void read() {
        System.out.println("|| " + getNim() + " \t|| " + getNama() + " \t|| " + getIpk() + " \t||");
    }
}
