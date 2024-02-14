package com.bridzelabz10;

class Triangle {
    double base;
    double height;

    // Constructor
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate area of triangle
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Rectangle {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    double calculateArea() {
        return length * width;
    }
}


public class Area {
	 // Method to calculate area of triangle
    static double calculateTriangleArea(Triangle triangle) {
        return triangle.calculateArea();
    }

    // Method to calculate area of rectangle
    static double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.calculateArea();
    }

    public static void main(String[] args) {
        // Creating objects for triangle and rectangle
        Triangle triangle = new Triangle(5, 8);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculating area of triangle and rectangle
        double triangleArea = calculateTriangleArea(triangle);
        double rectangleArea = calculateRectangleArea(rectangle);

        // Displaying the areas
        System.out.println("Area of Triangle: " + triangleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }

}
