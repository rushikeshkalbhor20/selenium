package javaPackage;

import java.util.Scanner;
interface Demo
	{
		 void Accept();
		 void Display();
	}
	
	class Abccc implements Demo
	{
		String name;
		Scanner sc = new Scanner(System.in);
		public void Accept()
		{
			
			System.out.println("Enter Name");
			name = sc.next();
		}
			public void Display()
		{
			System.out.println("Name = " +name);
		}
	}	
	
		public class Interface_program3
			{
				public static void main(String[] args) {
					Demo m1= new Abccc();
					m1.Accept();
					m1.Display();
					
				}
			}
		
