/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.j1.s.p0061;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class InputValidate {
   public Scanner sc = new Scanner(System.in);
   
    public double checkInput(){
        while (true) {
            try {
                double a = Double.parseDouble(sc.nextLine());
                if(a > 0){
                    return a;
                }else{
                    System.out.println("Must be > 0 ");
                } 
            } catch (NumberFormatException e) {
                System.err.println("Invalid!! Input again");
            }
        }
    }
    
    public Triangle InputTriangle(){
        while(true){
        System.out.println("Please input side A of Triangle: ");
        double a = checkInput();
        System.out.println("Please input side B of Triangle: ");
        double b = checkInput();
        System.out.println("Please input side C of Triangle: ");
        double c = checkInput();
        if(a + c > b && a + c > b && b + c > a ){
            return new Triangle(a, b, c);
        }else{
            System.out.println("Invalid!! Input again");
        }
    }
}
    
    public Rectangle InputRectangle(){
       
        System.out.println("Please input width of Rectangle: ");
        double a = checkInput();
        System.out.println("Please input length of Rectangle: ");
        double b = checkInput();
       return new Rectangle(a, b);

}
    
    public Circle InputCircle(){
        System.out.println("Please input radius of Circle: ");
        double r = checkInput();
       return new Circle(r);

    }
}

