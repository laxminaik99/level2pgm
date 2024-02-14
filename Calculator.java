package com.bridzelabz10;
import java.util.*;

public class Calculator {
	
	  public static double add(double num1, double num2) {
	        return num1 + num2;
	    }

	    public static double subtract(double num1, double num2) {
	        return num1 - num2;
	    }

	    public static double multiply(double num1, double num2) {
	        return num1 * num2;
	    }

	    public static double divide(double num1, double num2) {
	        if (num2 != 0) {
	            return num1 / num2;
	        } else {
	            System.out.println("Error: Cannot divide by zero");
	            return Double.NaN; // Not-a-Number
	        }
	    }

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Welcome to Calculator");
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Select operation:");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        System.out.print("Enter choice: ");
	        int choice = scanner.nextInt();

	        double result = 0;

	        switch (choice) {
	            case 1:
	                result = add(num1, num2);
	                break;
	            case 2:
	                result = subtract(num1, num2);
	                break;
	            case 3:
	                result = multiply(num1, num2);
	                break;
	            case 4:
	                result = divide(num1, num2);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }

	        System.out.println("Result: " + result);
	    }

	  
}
