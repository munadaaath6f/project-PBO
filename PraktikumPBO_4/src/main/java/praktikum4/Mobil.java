/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author munad
 */
public class Mobil extends Kendaraan {

    public Mobil(String nama, int kecepatanMaks, String jenisMesin) {
        super(nama, kecepatanMaks, jenisMesin);
    }

    public void tampilkanInfoMobil() {
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h");
        
        System.out.println("Jenis Mesin Mobil: " + jenisMesin);
        
    }
}