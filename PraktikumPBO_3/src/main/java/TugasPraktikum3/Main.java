/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum3;

/**
 *
 * @author munad
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dengan constructor lama (3 parameter)
        System.out.println("=== MENGGUNAKAN CONSTRUCTOR LAMA (3 PARAMETER) ===");
        Mobil mobil1 = new Mobil("Toyota", "Camry", 2022);
        mobil1.displayInfo();
        mobil1.startEngine();
        
        // Membuat objek dengan constructor baru (4 parameter)
        System.out.println("\n=== MENGGUNAKAN CONSTRUCTOR BARU (4 PARAMETER) ===");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Merah");
        mobil2.displayInfo();
        mobil2.startEngine();
        
        // Demo mengubah warna untuk mobil1 (yang awalnya tidak punya warna)
        System.out.println("\n=== DEMO MENGUBAH WARNA ===");
        System.out.println("Warna mobil1 sebelum diubah: " + mobil1.getWarna());
        mobil1.ubahWarna("Hitam");
        System.out.println("Warna mobil1 setelah diubah: " + mobil1.getWarna());
        mobil1.displayInfo();
        
        // Demo menggunakan setter untuk mengubah warna
        System.out.println("\n=== DEMO SETTER WARNA ===");
        mobil2.setWarna("Biru");
        System.out.println("Warna mobil2 setelah diubah via setter: " + mobil2.getWarna());
        mobil2.displayInfo();
    }
}
