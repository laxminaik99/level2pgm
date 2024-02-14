package com.bridzelabz10;

class MyClass {
  
    static int count = 0;

    MyClass() {
        count++;
    }

 
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class CountObject {
	

	
	    public static void main(String[] args) {
	       
	        MyClass obj1 = new MyClass();
	        MyClass obj2 = new MyClass();
	        MyClass obj3 = new MyClass();

	        MyClass.displayCount();
	   
	}


}
