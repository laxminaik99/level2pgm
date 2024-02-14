package com.bridzelabz10;

public class NestingMethod {
	  public static void main(String[] args) {
		  NestingMethod obj = new  NestingMethod();
	        obj.outerMethod();
	    }

	    void outerMethod() {
	        System.out.println("This is the outer method.");
	        innerMethod();
	    }

	    void innerMethod() {
	        System.out.println("This is the inner method.");
	    }

}
