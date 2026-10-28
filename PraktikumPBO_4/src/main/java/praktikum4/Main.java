/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author munad
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Budi Santoso", 30, "Software Engineer", 15000000);
        System.out.println("=== Informasi Pekerja ===");
        System.out.println(pekerja1.toString());
        System.out.println();
        pekerja1.setNama("Budi Hartono");
        System.out.println("=== Informasi Setelah Nama Diubah ===");
        System.out.println(pekerja1.toString());
        System.out.println();
        System.out.println("=== Percobaan Akses Langsung Atribut ===");
        System.out.println("1. Akses langsung 'nama' (private): TIDAK BISA - Error: nama has private access in Manusia");
        System.out.println("2. Akses langsung 'usia' (protected): BISA - Nilai: " + pekerja1.usia);
        System.out.println("3. Akses langsung 'gaji' (private): TIDAK BISA - Error: gaji has private access in Pekerja");
        System.out.println("4. Akses langsung 'pekerjaan' (public): BISA - Nilai: " + pekerja1.pekerjaan);
        System.out.println("\n=== Akses yang Benar (Melalui Getter/Setter) ===");
        System.out.println("Nama (getter): " + pekerja1.getNama());
        System.out.println("Usia (getter): " + pekerja1.getUsia());
        System.out.println("Pekerjaan (getter): " + pekerja1.getPekerjaan());
        System.out.println("Gaji (getter): Rp " + pekerja1.getGaji());
    }
}
