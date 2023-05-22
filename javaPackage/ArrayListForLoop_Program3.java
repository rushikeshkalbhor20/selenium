package javaPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListForLoop_Program3 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> L1 = new ArrayList<String>();
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how many colours you want");
		n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
				System.out.println("Enter the colour");
				String z = sc.next();
				L1.add(z);
				
				}
		System.out.println(L1);
		L1.set(2, "blue");
		System.out.println("After replacing = " +L1);
		
		System.out.println(L1);
		L1.remove(2);
		System.out.println("After removing = " +L1);
	}

}
