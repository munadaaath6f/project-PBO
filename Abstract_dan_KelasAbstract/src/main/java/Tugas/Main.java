/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author munad
 */

// Kelas utama untuk pengujian
public class Main {
    public static void main(String[] args) {
        // Polimorfisme: referensi Hewan menunjuk objek subclass
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        kucing.suara();
        anjing.suara();
    }
}