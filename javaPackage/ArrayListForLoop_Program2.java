package javaPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListForLoop_Program2 {
	
	public static void main(String[] args) {
		
		
	ArrayList<String> Listname = new ArrayList<String>();
	ArrayList<String> L1 = new ArrayList<String>();
	
	
	int  n ;

	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter the numbers of elements you want to store");
	n = Sc.nextInt(); 
	
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the elements of array");
		String z=Sc.next();
		L1.add(z);
	
	}
	System.out.println(L1);
	L1.remove(2);
	System.out.println("After Remove = "+L1);

	System.out.println(L1);
	L1.set(3, "Rush");
	System.out.println("After Replacing = "+L1);

	}


}
