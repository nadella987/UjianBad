/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author PC
 */
public class Kucing extends Hewan {
   private String ras;

    public Kucing(String nama, String jenis, String ras) {
        super(nama, jenis);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }
    
}
