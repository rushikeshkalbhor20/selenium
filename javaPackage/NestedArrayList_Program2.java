package javaPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class NestedArrayList_Program2 {

	public static void main(String[] args) {
		int n;
		String Name;
		ArrayList<String> L1 = new ArrayList<String>();
		
		ArrayList<ArrayList<String>> L2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter the number of name you want to add");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			L1 = new ArrayList<String>();
			for(int j=0;j<2;j++)
			{	
				
			System.out.println("Enter the name you want to enter = ");
			Name=sc.next();
			L1.add(Name);
			
			
		}
			L2.add(L1);
	
		}
		System.out.println(L2);
		}
}

		
		
		
		// [[ram,sham],[priya,riya],[poi,roy]]


