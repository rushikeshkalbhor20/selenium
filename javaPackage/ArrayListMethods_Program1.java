package javaPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods_Program1 {

	
		ArrayList<String> L1 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int n,index;
		String Colour1,Ncolour,Colour;

		public void add()
		{
			System.out.println("Please enter how many colours you want");
			n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter the Colour");
				Colour1 = sc.next();
				L1.add(Colour1);

			}
			System.out.println(L1);
		}
			public void display()
			{
				System.out.println("First colour = " +L1);

			}
			
			public void replace()
			{
				display();
				System.out.println("Enter the index number to replace");
				index = sc.nextInt();
				System.out.println("Enter the new colour to replace");
				Colour = sc.next();
				
				L1.set(index, Colour);
				System.out.println("After replacing the colour = " +L1);
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
				ArrayListMethods_Program1 obj1 = new ArrayListMethods_Program1();
				obj1.add();
				obj1.display();
				obj1.replace();
				obj1.Remove();
				
			}
			
		}
		


