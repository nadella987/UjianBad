/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Rectangle;

/**
 *
 * @author PC
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //membuat object rectangle dengan lebar 5 dan tinggi 10
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5.0);
        rectangle.setHeight(10.0);
        
        //menghitung dan menampilkan luas dari persegi panjang
        double persegiPanjang = rectangle.getTotalLuas();
        System.out.println("Lebar Persegi Panjang: " + rectangle.getWidth());
        System.out.println("Tinggi Persegi Panjang: " + rectangle.getHeight());
        System.out.println("Luas Persegi Panjang: "+ persegiPanjang );
    }
    
}

