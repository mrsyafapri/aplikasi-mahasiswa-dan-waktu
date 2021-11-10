package com.rizki.uts;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class App {

    static String nama, nim;
    static double ipk;
    static StackLinkedList tumpukan = new StackLinkedList();
    static QueueLinkedList antrian = new QueueLinkedList();
    static Mahasiswa data;

    public static void runStack() {
        boolean kondisi = true;
        while (kondisi) {
            System.out.println("\nPendataan Mahasiswa Menggunakan STACK Linked List");
            System.out.println("Pilih Menu di bawah ini");
            System.out.println("1. Menambahkan Data (PUSH)");
            System.out.println("2. Ambil/Hapus elemen Top/Terakhir dari Data (POP)");
            System.out.println("3. Lihat elemen Top/Terakhir dari Data (PEEK)");
            System.out.println("4. Lihat Semua Data");
            System.out.println("5. Cek Kosong (IS EMPTY)");
            System.out.println("6. Cek Penuh (IS FULL)");
            System.out.println("7. Hapus Semua Data (Clear)");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan Anda (1-8): ");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    Scanner inputString = new Scanner(System.in);
                    System.out.print("Masukkan Nama: ");
                    nama = inputString.nextLine();
                    Scanner input = new Scanner(System.in);
                    System.out.print("Masukkan Nim : ");
                    nim = input.next();
                    System.out.print("Masukkan IPK : ");
                    ipk = input.nextDouble();
                    data = new Mahasiswa();
                    data.setNama(nama);
                    data.setNim(nim);
                    data.setIpk(ipk);
                    tumpukan.push(data);
                    break;
                case 2:
                    if (tumpukan.isEmpty()) {
                        System.out.println("- Data Kosong -");
                    } else {
                        data = tumpukan.pop();
                        System.out.println(data.getNim() + " \t|| " + data.getNama() + " \t|| " + data.getIpk());
                        System.out.println("========== Data Sekarang ==========");
                        tumpukan.view();
                    }
                    break;
                case 3:
                    if (tumpukan.isEmpty()) {
                        System.out.println("- Data Kosong -");
                    } else {
                        data = tumpukan.peek();
                        System.out.println(data.getNim() + " \t|| " + data.getNama() + " \t|| " + data.getIpk());
                    }
                    break;
                case 4:
                    if (tumpukan.isEmpty()) {
                        System.out.println("- Data Kosong -");
                    } else {
                        tumpukan.view();
                    }
                    break;
                case 5:
                    if (tumpukan.isEmpty()) {
                        System.out.println("- Data Kosong -");
                    } else {
                        System.out.println("- Ada Isinya -");
                    }
                    break;
                case 6:
                    if (tumpukan.isFull()) {
                        System.out.println("- Data Penuh -");
                    } else if (tumpukan.isEmpty()) {
                        System.out.println("- Data Kosong -");
                    } else {
                        System.out.println("- Belum Penuh -");
                    }
                    break;
                case 7:
                    tumpukan.clear();
                    System.out.println("- Tumpukan dikosongkan -");
                    break;
                case 8:
                    System.out.println("- Keluar dari menu Pendataan Mahasiswa menggunakan STACK Linked List -");
                    kondisi = false;
                    break;
                default:
                    System.out.println("=== Mohon maaf menu tidak tersedia ===");
                    System.out.println("- Input menu harus diantara 1 sampai 8 -");
                    break;
            }
        }
    }

    public static void runQueue() {
        boolean kondisi = true;
        while (kondisi) {
            System.out.println("\nPendataan Mahasiswa Menggunakan QUEUE Linked List");
            System.out.println("Pilih Menu di bawah ini");
            System.out.println("1. Menambahkan Data (ENQUEUE)");
            System.out.println("2. Ambil/Hapus elemen Depan/Pertama dari Data (DEQUEUE)");
            System.out.println("3. Lihat elemen Depan/Pertama dari Data (PEEK)");
            System.out.println("4. Lihat Semua Data");
            System.out.println("5. Cek Kosong (IS EMPTY)");
            System.out.println("6. Cek Penuh (IS FULL)");
            System.out.println("7. Hapus Semua Data (Clear)");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan Anda (1-8): ");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    Scanner inputString = new Scanner(System.in);
                    System.out.print("Masukkan Nama: ");
                    nama = inputString.nextLine();
                    Scanner input = new Scanner(System.in);
                    System.out.print("Masukkan Nim : ");
                    nim = input.next();
                    System.out.print("Masukkan IPK : ");
                    ipk = input.nextDouble();
                    data = new Mahasiswa();
                    data.setNama(nama);
                    data.setNim(nim);
                    data.setIpk(ipk);
                    antrian.enqueue(data);
                    break;
                case 2:
                    if (antrian.isEmpty()) {
                        System.out.println("- Data Kosong -");
                    } else {
                        data = antrian.dequeue();
                        System.out.println(data.getNim() + " \t|| " + data.getNama() + " \t|| " + data.getIpk());
                        System.out.println("========== Data Sekarang ==========");
                        antrian.view();
                    }
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("- Data Kosong -");
                    } else {
                        data = antrian.peek();
                        System.out.println(data.getNim() + " \t|| " + data.getNama() + " \t|| " + data.getIpk());
                    }
                    break;
                case 4:
                    if (antrian.isEmpty()) {
                        System.out.println("- Data Kosong -");
                    } else {
                        antrian.view();
                    }
                    break;
                case 5:
                    if (antrian.isEmpty()) {
                        System.out.println("- Data Kosong -");
                    } else {
                        System.out.println("- Ada Isinya -");
                    }
                    break;
                case 6:
                    if (antrian.isFull()) {
                        System.out.println("- Data Penuh -");
                    } else if (antrian.isEmpty()) {
                        System.out.println("- Data Kosong -");
                    } else {
                        System.out.println("- Belum Penuh -");
                    }
                    break;
                case 7:
                    antrian.clear();
                    System.out.println("- Antrian dikosongkan -");
                    break;
                case 8:
                    System.out.println("- Keluar dari menu Pendataan Mahasiswa menggunakan QUEUE Linked List -");
                    kondisi = false;
                    break;
                default:
                    System.out.println("=== Mohon maaf menu tidak tersedia ===");
                    System.out.println("- Input menu harus diantara 1 sampai 8 -");
                    break;
            }
        }
    }

    public static void runAdt() {
        System.out.println("\nWaktu Sekarang Menggunakan ADT Date");
        Date date = new Date();
        int detik = date.getSeconds();
        int menit = date.getMinutes();
        int jam = date.getHours();
        int day = date.getDay();
        int tanggal = date.getDate();
        int month = date.getMonth();
        int tahun = date.getYear();
        String waktu;
        if (jam > 12) {
            waktu = "PM";
        } else {
            waktu = "AM";
        }
        System.out.println("===================================");
        String[] days = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu"};
        String[] months = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        System.out.println("Sekarang : " + jam + ":" + menit + ":" + detik + " " + waktu);
        System.out.println("Hari: " + days[day] + ", Tanggal: " + tanggal + " " + months[month] + " " + tahun);
        System.out.println("===================================");
        System.out.println("- Keluar dari menu Waktu Sekarang Menggunakan ADT Date -");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============== Selamat Datang ==============");
        System.out.println("Aplikasi Pendataan Mahasiswa UIN SUSKA Riau dan Waktu Sekarang");
        System.out.println("Oleh Muhammad Rizki Syafapri (12050110483)");
        boolean kondisi = true;
        while (kondisi) {
            System.out.println();
            System.out.println("Pilih MENU UTAMA di bawah ini:");
            System.out.println("1. Pendataan Mahasiswa Menggunakan STACK Linked List");
            System.out.println("2. Pendataan Mahasiswa Menggunakan QUEUE Linked List");
            System.out.println("3. Waktu Sekarang Menggunakan ADT Date");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan Anda (1/2/3/4) : ");
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    App.runStack();
                    break;
                case 2:
                    App.runQueue();
                    break;
                case 3:
                    App.runAdt();
                    break;
                case 4:
                    System.out.println("============== Keluar Program ==============");
                    kondisi = false;
                    break;
                default:
                    System.out.println("=== Mohon maaf menu tidak tersedia ===");
                    System.out.println("- Input MENU UTAMA harus diantara 1 sampai 4 -");
                    break;
            }
        }
    }

}
