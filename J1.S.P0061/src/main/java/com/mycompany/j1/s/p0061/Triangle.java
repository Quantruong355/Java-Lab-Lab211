/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.j1.s.p0061;

/**
 *
 * @author Acer
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
      double p = (a + b + c)/2;
      double s = Math.sqrt(p*(p - a)*(p - b)*(p - c));
      return s;
    }

    @Override
    public double getPerimeter() {
        double p = a + b + c;
        return p;
    }

    @Override
    public void printResult() {
        System.out.println("------Triangle------");
        System.out.println("Side A: " + a);
        System.out.println("Side B: " + b);
        System.out.println("Side C: " + c);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
}
