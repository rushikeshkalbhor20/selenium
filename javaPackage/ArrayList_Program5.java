package javaPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Program5 {

		public static void main(String[] args) {
			
			
			ArrayList<String> Listname = new ArrayList<String>();
			ArrayList<String> L1 = new ArrayList<String>();
			
			
			int m;
			//String a, b , c,  d ;

			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter the number of names you want to store");
			m = Sc.nextInt();
			
			for(int i=0;i<m;i++)
			{
				System.out.println("Enter the names of array");
				String z=Sc.next();
				L1.add(z);
				
			}
				System.out.println(L1);
				L1.set(2, "Rush");
				System.out.println("After Replacing = " +L1);
				
				System.out.println(L1);
				L1.remove(3);
				System.out.println("After removing = "+L1);
				

				
			
		/*	System.out.println("Enter the First Name");
			a=Sc.next();
			L1.add("a");
			
			System.out.println("Enter the Second Name");
			b=Sc.next();
			L1.add("b");
			
			System.out.println("Enter the Third  Name");
			c=Sc.next();
			L1.add("c");
			
			System.out.println("Enter the Forth Name");
			d=Sc.next();
			L1.add("d");
			
			System.out.println("First name = " +a );
			System.out.println("Second name = " +b );
			System.out.println("Third name = " +c );
			System.out.println("Forth name = " +d );
			
			L1.set(2,"xyz");
			System.out.println(L1);

			L1.remove(2);
			System.out.println(L1);	
			System.out.println(L1);
			*/
	}

	}


