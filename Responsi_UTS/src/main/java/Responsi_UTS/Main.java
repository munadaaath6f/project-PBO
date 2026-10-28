/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_UTS;

/**
 *
 * @author munad
 */ public class Main {
    public static void main(String[] args) {
        // Polimorfisme: referensi kelas induk memegang objek kelas turunan
        Produk produk1 = new Elektronik("Smartphone Galaxy", 8500000, 1);
        Produk produk2 = new Makanan("Keripik Tempe", 12500, "15-08-2027");

        Pegawai pegawai1 = new Pegawaitetap("Siti", 6000000, 1500000);
        Pegawai pegawai2 = new Pegawaikontrak("Rudi", 3500000, 6);

        System.out.println("===== DAFTAR PRODUK =====");
        produk1.tampilkanInfo();
        System.out.println("-------------------------");
        produk2.tampilkanInfo();

        System.out.println("\n===== DAFTAR PEGAWAI =====");
        pegawai1.tampilkanInfo();
        System.out.println("-------------------------");
        pegawai2.tampilkanInfo();

        // Polimorfisme lewat array referensi induk
        Produk[] semuaProduk = { produk1, produk2 };
        Pegawai[] semuaPegawai = { pegawai1, pegawai2 };

        System.out.println("\n===== POLIMORFISME (LOOP) =====");
        for (Produk p : semuaProduk) {
            p.tampilkanInfo();
            System.out.println();
        }
        for (Pegawai T : semuaPegawai) {
            T.tampilkanInfo();
            System.out.println();
        }
    }
}