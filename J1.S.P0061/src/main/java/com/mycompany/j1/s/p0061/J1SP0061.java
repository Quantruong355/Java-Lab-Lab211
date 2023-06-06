/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.j1.s.p0061;

/**
 *
 * @author Acer
 */
public class J1SP0061 {
    public static Rectangle rectangle = new Rectangle();
    public static Circle    circle = new Circle();
    public static Triangle  triangle = new Triangle();
    
    public static void main(String[] args) {
       InputValidate iv = new InputValidate();
        System.out.println("=====Calculator Shape Program=====");
       rectangle = iv.InputRectangle();
       circle = iv.InputCircle();
       triangle =  iv.InputTriangle();
       rectangle.printResult();
       circle.printResult();
       triangle.printResult();
       
    }
}
