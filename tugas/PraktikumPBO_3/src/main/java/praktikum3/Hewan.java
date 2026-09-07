/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author munad
 */
public class Hewan {
    // 1. Atribut dengan access modifier private (Encapsulation)
    private String nama;
    private int umur;
    
    // 2. Constructor dengan parameter
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    // 3. Getter untuk nama
    public String getNama() {
        return nama;
    }
    
    // 4. Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // 5. Getter untuk umur
    public int getUmur() {
        return umur;
    }
    
    // 6. Setter untuk umur
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    // 7. Method suara()
    void suara() {
        System.out.println("Hewan bersuara");
    }
    
    // 8. Method info()
    void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur());
    }
}
