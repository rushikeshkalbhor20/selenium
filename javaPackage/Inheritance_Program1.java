package javaPackage;

import java.util.Scanner;

	
	 class Principle
	{
	Scanner Sc = new Scanner(System.in);
	int id,salary;
	String name;
	
	public void Accept()
	{
		System.out.println("Enter Principle ID = ");
		id= Sc.nextInt();
		System.out.println("Enter principle Name = ");
		name= Sc.next();
		System.out.println("Enter principle Salary");
		salary= Sc.nextInt();
	}
	public void Display()
	{
		System.out.println("Principle id is = " +id);
		System.out.println("Principle name is = " +name);
		System.out.println("Principe salary is = " +salary);

	}
}
	class Teacher extends Principle
	{
		public void Accept1()
		{
			Accept();
			System.out.println("Enter Teacher ID = ");
			id= Sc.nextInt();
			System.out.println("Enter Teacher Name = ");
			name= Sc.next();
			System.out.println("Enter Teacher Salary");
			salary= Sc.nextInt();
			}
		public void Display1()
		{
			Display();
			System.out.println("Teacher id is = " +id);
			System.out.println("Teacher Name is = "+name);
			System.out.println("Teacher salary is = "+salary);
		}
	}
	class Student extends Teacher
	{
		public void Accept2()
		{
			Accept1();
			System.out.println("Enter Student ID = ");
			id= Sc.nextInt();
			System.out.println("Enter Student Name = ");
			name= Sc.next();
			}
		public void Display2()
		{
			Display1();
			System.out.println("Student ID is = " +id);
			System.out.println("Student name is = " +name);
			}
	}
	public class Inheritance_Program1 {

	public static void main(String[] args)
	{
		Student s = new Student();
		s.Accept2();
		
		s.Display2();
		
		
	}
}

