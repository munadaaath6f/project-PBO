/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author munad
 */

public class Kucing extends Hewan {

    public Kucing(String nama, String jenis) {
        super(nama, jenis);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: Meong!");
    }

    public void suaraKhas() {
        System.out.println(nama + " bersuara: Meong!");
    }
}