package javaPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class NestedArrayList_Program3 {

		
		ArrayList<String> L1 = new ArrayList<String>();
		ArrayList<ArrayList<String>> L2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);	
		int n,index;
		
		String Name, nName, oindex;
		
		public void Accept()
		{
			System.out.println("Enter the number of name you want to add");
			int n=sc.nextInt();
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
		}
			public void Display()
			{
				System.out.println(L2);

			}
			public void Remove()
			{
				System.out.println("Enter the index of name you want to remove");
				index=sc.nextInt();		
				L2.remove(index).indexOf(L1);
				System.out.println("After removing = " +L2);
				
				}
			public void Replace()
			{
				String nindex;
				
				
				System.out.println("Enter the outer index you want update");
				oindex=sc.next();
				System.out.println("Enter the inner index you want update");
				nindex=sc.next();
				System.out.println("Enter the name you want update");
				nName=sc.next();
				L2.get(Integer.parseInt(oindex)).set(Integer.parseInt(nindex),nName);
				System.out.println(L2);
				}

			public static void main(String[] args) {
				
				NestedArrayList_Program3 x = new NestedArrayList_Program3();
				Scanner sc = new Scanner(System.in);
				int choice=1; 
				while (choice<=5)
				{
					System.out.println("Enter your choice ");
					choice=sc.nextInt();
				switch (choice)
				{
				case 1: x.Accept();
				
				break;
				
				case 2: x.Display();
				
				break;
				
				case 3: x.Remove();

				break;
				
				case 4: x.Display();
				
				break;
				
				case 5: x.Replace();
				
				break;
				
				case 6: System.out.println("Invaild choice");
				
				break;
				}

				}
			}
			}
