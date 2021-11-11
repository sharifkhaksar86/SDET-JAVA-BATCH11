package com.syntax.class15Homework;

public class StudentTester {

	public static void main(String[] args) {
		

		Student Farhad =new Student();
		Farhad.studentName="Farhad";
		Farhad.studentID="S050";
		Farhad.numberOfStudents=20;
		System.out.println(Farhad.studentName+"\n" + Farhad.studentID+"\n"+Farhad.numberOfStudents );
		
		Student Sharif= new Student();
		Sharif.studentName="Sharif";
		Sharif.studentID="S050";
		Sharif.numberOfStudents+=5;
		System.out.println(Sharif.studentName+"\n" + Sharif.studentID+"\n"+Sharif.numberOfStudents );
	
		Student Maryam= new Student();
		Maryam.studentName="Sharif";
		Maryam.studentID="S050";
		Maryam.numberOfStudents+=5;
		System.out.println(Maryam.studentName+"\n" + Maryam.studentID+"\n"+Maryam.numberOfStudents );
	}

}
