package com.syntax.class14Homework;

public class Class14Homework3 {

	public static void main(String[] args) {
		// You have a String a=�Is it Saturday? Is it raining? Do we have a Java
		// Class
		// today?� How would you find out how many sentences are in that String?

		String str = "It is Saturday? Is it raining? Do we have a Java Class today? we will enjoy the class!";

		System.out.println("This String has " + str.split("[?.!]").length + " sentences");//split returns an array

	}

}
