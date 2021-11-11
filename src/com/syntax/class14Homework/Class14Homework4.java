package com.syntax.class14Homework;

public class Class14Homework4 {

	public static void main(String[] args) {
		// How would you reverse a String character by character?

		String str ="abcdefghijklmnopqrstuvwxyz";
		
		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i)+" ");
			
		}
		
	}

}
