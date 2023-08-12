/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangle;

/**
 *
 * @author PC
 */
public class Rectangle {
 private double width; 
 private double height; 
 
 public double getWidth() { 
    return width; 
 } 
 
 public void setWidth(double width) { 
    this.width = width; 
 } 
 
 public double getHeight() { 
    return height;
 }
 
 public void setHeight(double height) { 
    this.height = height; 
 } 
 
  public double getTotalLuas() {
        return width * height;
    }
    
}