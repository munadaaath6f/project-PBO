/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_UTS;

/**
 *
 * @author munad
 */ public class Pegawaitetap extends Pegawai {
    private double tunjangan;

    public Pegawaitetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() { return tunjangan; }
    public void setTunjangan(double tunjangan) { this.tunjangan = tunjangan; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan : " + formatRupiah(tunjangan));
    }
}