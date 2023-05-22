package javaPackage;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap <Integer,String> h1 = new HashMap <Integer, String>();
		
		System.out.println("Enter number of key ");
		int n=sc.nextInt();
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the key");
			int x1=sc.nextInt();
			System.out.println("Enter the value");
			String x2=sc.next();
			
			h1.put(x1, x2);
			System.out.println(h1);
		}
		
			System.out.println("Enter the Key to replace");
			int x3=sc.nextInt();
			System.out.println("Enter the value to replace");
			String x4=sc.next();
			h1.replace(x3, x4);
			System.out.println(h1);
	
			
			
			System.out.println("Enter the key to remove");
			int x5=sc.nextInt();
			
			h1.remove(x5);
			System.out.println(h1);
	
			}
}


