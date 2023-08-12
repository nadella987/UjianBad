/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PerhitunganAkarKuadrat;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class MainApp {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();

        try {
            if (angka < 0) {
                throw new IllegalArgumentException("Bilangan negatif tidak diizinkan");
            }

            double akarKuadrat = Math.sqrt(angka);
            System.out.printf("Akar Kuadrat dari Angka yang Diberikan %.0f = %.1f%n", angka, akarKuadrat);
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        scanner.close();
    }
}
