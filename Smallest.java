package com.bridzelabz10;
import java.util.*;

public class Smallest {

	public static int findSmallest(int[] arr) {
	    int small = Integer.MAX_VALUE; 
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] < small) {
	        	small = arr[i];
	        }
	    }
	    return small;
	}
	public static void Duplicate(int[] arr) {
		System.out.println("Duplicate numbers:");
	    for (int i = 0; i < arr.length-1; i++) {
	    	for (int j = i+1; j < arr.length-1; j++) {
	        if (arr[i] == arr[j]) {
	        	System.out.println(arr[i]);
	        }}
	    }
	    
	}
	public static void OddPosition(int[] arr) {
		System.out.println("OddPosition elements:");
	    for (int i = 0; i < arr.length-1; i++) {
	        if (i%2!=0) {
	        	System.out.println(arr[i]);
	        }
	    }
	    
	}

	public static void main(String[] args) {
		//Java Program to print the smallest element in an array
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		for(int i=0 ;i <5; i++) {
			arr[i]=sc.nextInt();	
			}
		int p=findSmallest(arr);
		System.out.println(p);
		 Duplicate(arr);
		 OddPosition(arr);

	}

}
