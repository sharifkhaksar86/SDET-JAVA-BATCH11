package com.syntax.class15;

public class Dog {
		// we have 3 types of variables local Static and instance
	// instance variables are those which are outside the block of code. we can also use them without initialization.
	// local variable is the variable inside the block of code. we must initialize them 
	// Static variables are the same us instance variable with the keyword static
	
		static int noOfLegs=4;
		String name;//instance variable 
		String color;// instance variable
		
		void sleep() {
			int times=3;
			System.out.println(times);
			System.out.println(name+ " is sleeping");
		}

		void eat() {
			System.out.println(name+ " can eat");
		}
		
	}


