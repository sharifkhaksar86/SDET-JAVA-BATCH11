package com.syntax.class15;

public class Class14recap {

	public static void main(String[] args) {
		
		String str= "this is Lubo, Lubo is break manager";
		System.out.println(str.replace("Lubo", "Sorbon"));
		System.out.println(str.replaceAll("Lubo", "Sorbon"));//
		
		String str2= "kjlfapoiuer4546545wioASDF@#$&%";
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));//takes regular expression and range
		System.out.println(str2.replace("[^A-Za-z0-9]", ""));// it does not work for regular expression
		

	}

}
