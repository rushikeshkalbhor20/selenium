package javaPackage;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Program3 {

		
		Scanner sc = new Scanner(System.in);
		HashMap <Integer,String> h1 = new HashMap <Integer, String>();

		public void Accept()
		{
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
			
	}
		public void display()
		{
			System.out.println(h1);

		}


	public void replace()
	{
		System.out.println("Enter the Key to replace");
		int x3=sc.nextInt();
		System.out.println("Enter the value to replace");
		String x4=sc.next();
		h1.replace(x3, x4);
		System.out.println(h1);
	


	}
	public void remove()
	{
		System.out.println("Enter the key to remove");
		int x5=sc.nextInt();
		
		h1.remove(x5);
		System.out.println(h1);

	}
	public static void main(String[] args) {
		
		HashMap_Program3 hash = new HashMap_Program3();
		hash.Accept();
		hash.display();
		hash.replace();
		hash.replace();
	}
	}
