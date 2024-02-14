package com.bridzelabz10;

public class AreaOverloading {
	   
    static double calculateArea(double side) {
        return side * side;
    }

    static double calculateArea(double length, double width) {
        return length * width;
    }

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double side = 5.0;
        double length = 6.0;
        double width = 4.0;
        double radius = 3.0;

       
        System.out.println("Area of square with side " + side + " is: " + calculateArea(side));

        System.out.println("Area of rectangle with length " + length + " and width " + width + " is: " + calculateArea(length, width));

        System.out.println("Area of circle with radius " + radius + " is: " + calculateArea(radius));
    }
}
