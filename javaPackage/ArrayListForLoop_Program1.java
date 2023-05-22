package javaPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListForLoop_Program1 {


	public static void main(String[] args) {
		
		
	ArrayList<Integer> Listname = new ArrayList<Integer>();
	ArrayList<Integer> L1 = new ArrayList<Integer>();
	
	
	int  n ;

	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter the numbers of elements you want to store");
	n = Sc.nextInt(); 
	
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the elements of array");
		int z=Sc.nextInt();
		L1.add(z);
	
	}
	System.out.println(L1);
	L1.remove(2);
	System.out.println("After Remove = "+L1);

	System.out.println(L1);
	L1.set(2, 100);
	System.out.println("After Replacing = "+L1);

	
	
	}
	

	}


