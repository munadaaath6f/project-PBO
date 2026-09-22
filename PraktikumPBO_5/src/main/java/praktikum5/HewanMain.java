/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author munad
 */
public class HewanMain {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Mimi", "Persia");
        kucing.tampilkanInfo();
        kucing.suaraKhas();

        System.out.println();

        Anjing anjing = new Anjing("Rex", "German Shepherd");
        anjing.tampilkanInfo();
        anjing.suaraKhas();
    }
}