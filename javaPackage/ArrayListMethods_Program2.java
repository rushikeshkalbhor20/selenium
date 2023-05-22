package javaPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods_Program2 {

	
	ArrayList<String> L1 = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	int n,index;
	String Studentname,Student1,Colour;

	public void add()
	{
		System.out.println("Please enter how many Students are there");
		n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Student name");
			Studentname = sc.next();
			L1.add(Studentname);

		}
		System.out.println(L1);
	}
		public void display()
		{
			System.out.println("Name of Student = " +L1);

		}
		
		public void replace()
		{
		
			System.out.println("Enter the index number to replace");
			index = sc.nextInt();
			System.out.println("Enter the new student name to replace");
			Student1 = sc.next();
			
			L1.set(index, Student1);
			System.out.println("After replacing the Student name = " +L1);
		}
		public void Remove()
		{
			
			System.out.println(L1);
			System.out.println("Enter the index number to remove");
			index = sc.nextInt();
			
			
			L1.remove(index);
			System.out.println("After removing = " +L1);
		}
		
		public static void main(String[] args) {
			ArrayListMethods_Program2 obj1 = new ArrayListMethods_Program2();
			obj1.add();
			obj1.display();
			obj1.replace();
			obj1.Remove();
			
		}
		
	}
	




