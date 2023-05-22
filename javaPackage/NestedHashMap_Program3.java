package javaPackage;

import java.util.HashMap;
import java.util.Scanner;

public class NestedHashMap_Program3 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		HashMap<String, HashMap> h2 = new HashMap<String, HashMap>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Employees");
		int n=sc.nextInt();
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter name of the Employee");
			String n1=sc.next();
			
			
			System.out.println("Enter City of Employee");
			String n2 =sc.next();
			System.out.println("Enter Employee Id of the Employee");
			int n3 =sc.nextInt();
			
			h1.put(n2, n3);
			h2.put(n1, h1);
			
			System.out.println("After Adding "  +h2);
		}
		
		//replace
		System.out.println("Enter the employee name to replace");
		String n4=sc.next();
		
		System.out.println("Enter the city to replace");
		String n5=sc.next();
		System.out.println("Enter new employee id");
		int n6=sc.nextInt();
		
		h2.get(n4).put(n5,n6);
		System.out.println(h2);
	}

}
