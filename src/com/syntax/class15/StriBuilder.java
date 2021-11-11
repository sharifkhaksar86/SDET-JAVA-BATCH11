package com.syntax.class15;

public class StriBuilder {

	public static void main(String[] args) {
		//String Builder

		String str ="";
		//String is not recommended here.
		for (int i=0; i<5; i++) {
			str=str+i;
		}
		System.out.println(str);
		
		
		//when you have to change the value of a String variable always use StringBuilder class
		// String class is immutable but StringBuilder class is mutable 
		StriBuilder stringBuilder= new StriBuilder();

		
		for (int i =0; i<5;i++) {
			StringBuilder stringBuilder2 = new StringBuilder();
			stringBuilder2.append(i);
		}
		
		System.out.println(stringBuilder);
		
		String str4="I am farhad I am married and I have 3 kids";
		StringBuilder strBuilder=new StringBuilder(str4);
		strBuilder.reverse();
		System.out.println(strBuilder);
		
		
	}

}
