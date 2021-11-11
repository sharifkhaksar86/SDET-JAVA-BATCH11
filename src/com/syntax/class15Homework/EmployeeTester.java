package com.syntax.class15Homework;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee Asghar =new Employee();
		
		Asghar.name="Asghar";
		Asghar.empID="S01";
		Asghar.Salary=5000;
		System.out.println(Asghar.name+" "+Asghar.empID+" "+Asghar.Salary+" "+Employee.CEO );
		
		
		Employee Moazzam = new Employee();
		Moazzam.name="Moazzam";
		Moazzam.empID="S02";
		Moazzam.Salary=4500;
		System.out.println(Moazzam.name+" "+Moazzam.empID+" "+ Moazzam.Salary+" "+ Employee.CEO);
		
	}

}
