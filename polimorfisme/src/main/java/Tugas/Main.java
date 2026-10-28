/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author munad
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Pemrograman Java", 150000));
        keranjang.tambahProduk(new Elektronik("Headphone", 500000));
        keranjang.tambahProduk(new Pakaian("Kemeja", 200000));
        keranjang.tambahProduk(new Buku("Algoritma", 120000));

        keranjang.tampilkanRincian();
    }
}
