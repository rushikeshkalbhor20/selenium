package javaPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListForLoop_Program4 {
	
	ArrayList<String> L1 = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	int n=0, index;
	String workername,worker;
	
		public void Accept()
		{
			System.out.println("Please Enter number of workers");
			n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
			System.out.println("Enter the name of the workers");
			workername = sc.next();
			L1.add(workername);
}
		System.out.println(L1);
		}
			public void Display()
		{
			System.out.println("Name of the worker = " +L1);
			
				}
			
			public void Replace()
			{
			System.out.println("Enter the index number to replace");
			index = sc.nextInt();
			System.out.println("Enter the new worker to replace the old one");
			worker = sc.next();

			L1.set(index, worker);
			System.out.println("After replacing the old worker = " +L1);

			}
			public void Remove()
			{
			System.out.println(L1);
			System.out.println("Enter the index number to remove");
			index= sc.nextInt();

			L1.remove(index);
			System.out.println("Ater Removing = " +L1);
			}

			public static void main(String[] args) {
				
				ArrayListForLoop_Program4  x = new ArrayListForLoop_Program4();
				Scanner sc = new Scanner(System.in);
				int choice=1; 
				while (choice<=4)
				{
					System.out.println("Enter your choice ");
					choice=sc.nextInt();
				switch (choice)
				{
				case 1: x.Accept();

				break;

				case 2 :x.Display();

				break;
				
				case 3 :x.Replace();

				break;
				
				case 4: x.Remove();
				break;
				
				case 5: System.out.println("Invaild choice");   
				break;
}
			}
			}
}
