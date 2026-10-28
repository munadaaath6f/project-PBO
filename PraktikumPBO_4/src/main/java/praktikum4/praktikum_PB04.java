/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author munad
 */
public class praktikum_PB04 {

    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 180, "Bensin");

        System.out.println("=== Informasi Kendaraan (Method dari Superclass) ===");
        mobil.tampilkanInfoKendaraan();
        System.out.println();

        System.out.println("=== Informasi Mobil (Method dari Subclass) ===");
        mobil.tampilkanInfoMobil();
        System.out.println();

        System.out.println("=== Percobaan Akses Langsung Atribut ===");
        System.out.println("Jenis Mesin (public): " + mobil.jenisMesin);
        System.out.println("Kecepatan Maks (protected): " + mobil.kecepatanMaks);
        System.out.println("Nama (via getter): " + mobil.getNama());
    }
}