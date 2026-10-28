/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_UTS;

/**
 *
 * @author munad
 */ public class Produk {
    private String namaProduk;
    private double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() { return namaProduk; }
    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    protected String formatRupiah(double nilai) {
        return String.format("Rp %,.0f", nilai).replace(',', '.');
    }

    public void tampilkanInfo() {
        System.out.println("Produk  : " + namaProduk);
        System.out.println("Harga   : " + formatRupiah(harga));
    }
}