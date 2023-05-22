package javaPackage;

import java.util.HashMap;
import java.util.Scanner;

public class NestedHashMap_Program2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		HashMap<String, HashMap> h2 = new HashMap<String, HashMap>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of values you want");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			//Add subject and marks
			 h1 = new HashMap<String, Integer>();
			 System.out.println("Enter the Name of the sudent");
				String n5=sc.next();
		System.out.println("Enter the Subject 1 Name");
		String n1=sc.next();
		System.out.println("Enter the subject 1 Marks");
		int n2=sc.nextInt();
		System.out.println("Enter the Subject 2 Name");
		String n4=sc.next();
		System.out.println("Enter the Subject 2 marks");
		int n3=sc.nextInt();
		
		h1.put(n1,n2);
		h1.put(n4, n3);
		h2.put(n5, h1);
		
		


		//System.out.println(h1);
		
		//Add Name

		
	

		System.out.println("After add="+h2);

		}

		
		//Replace
		System.out.println("Enter the Outer Key to replace");
		String n7=sc.next();
		System.out.println("Enter the Inner key  to replace");
		String n8=sc.next();
		System.out.println("Enter new value");
		int n9=sc.nextInt();
		h2.get(n7).put(n8, n9);
		System.out.println(h2);
//
//		
//		
//		
//		//Remove
//		System.out.println("Enter the key to remove");
//		int n9=sc.nextInt();
//	
//		h1.remove(n7);
//		System.out.println(h1);


		
		}
	
}

