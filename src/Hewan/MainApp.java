/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hewan;

/**
 *
 * @author PC
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Kucing kucing = new Kucing("Tom", "Persia", "Anggora");

        System.out.println("Nama Kucing: " + kucing.getNama());
        System.out.println("Jenis Hewan: " + kucing.getJenis());
        System.out.println("Ras Kucing: " + kucing.getRas());
    }
    
}
