/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_UTS;

/**
 *
 * @author munad
 */ public class Pegawaikontrak extends Pegawai {
    private int lamaKontrak; // dalam bulan

    public Pegawaikontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    public int getLamaKontrak() { return lamaKontrak; }
    public void setLamaKontrak(int lamaKontrak) { this.lamaKontrak = lamaKontrak; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak : " + lamaKontrak + " bulan");
    }
}