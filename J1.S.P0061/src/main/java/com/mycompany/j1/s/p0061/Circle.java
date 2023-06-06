/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.j1.s.p0061;

/**
 *
 * @author Acer
 */
public class Circle extends Shape {
    private double radius;

    public Circle(){
        
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
      double s = radius * radius * Math.PI;  
      return s;
    }

    @Override
    public double getPerimeter() {
      double p = radius * 2 * Math.PI;
      return p;
    }

    @Override
    public void printResult() {
       System.out.println("------Circle------");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    
}
