package com.syntax.class14;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Today is Tuesday? Today we have java class?";
		String[] strArr=str.split("[A-Z]");//inside the [] we specify at which character it should split. here it is based on question mark. 
		System.out.println(Arrays.toString(strArr));
		
		
		//for (String s:strArr) {// used to get all the elements of a string Array
			//System.out.println(s);
		}
	}


