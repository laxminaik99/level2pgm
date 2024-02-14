package com.bridzelabz10;

public class ArithmeticSum {
	
    static int findSum(int num1, int num2) {
        return num1 + num2;
    }

    static int findSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    static int findSum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 and 10 is: " + findSum(5, 10));
        System.out.println("Sum of 5, 10, and 15 is: " + findSum(5, 10, 15));
        System.out.println("Sum of 5, 10, 15, and 20 is: " + findSum(5, 10, 15, 20));
    }

}
