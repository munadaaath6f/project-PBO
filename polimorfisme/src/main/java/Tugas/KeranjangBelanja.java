/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author munad
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotalSetelahDiskon() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.hargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanRincian() {
        System.out.println("=== Rincian Belanja ===");
        for (Produk p : daftarProduk) {
            System.out.printf("%-15s Harga: Rp%,.0f | Diskon: Rp%,.0f | Bayar: Rp%,.0f%n",
                    p.getNama(), p.getHarga(), p.hitungDiskon(), p.hargaSetelahDiskon());
        }
        System.out.println("----------------------------------------");
        System.out.printf("Total setelah diskon: Rp%,.0f%n", hitungTotalSetelahDiskon());
    }
}
