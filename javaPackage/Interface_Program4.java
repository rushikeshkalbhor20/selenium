
package javaPackage;

import java.util.Scanner;


	interface Demo1
	{
		void Accept();
	

		void Display();
		}
	class Demo2 implements Demo1
	{
		Scanner sc = new Scanner(System.in);

		String name;
		public void Accept()
		{
			System.out.println("Enter student name =");
			name=sc.next();
		}
			public void Display()
			{
				System.out.println("Student name is = " +name);
			}
	}
	class Demo3 implements Demo1
	{
		Scanner sc = new Scanner(System.in);

		int rollno;
		public void Accept()
		{
			System.out.println("Enter Students Roll no");
			 rollno = sc.nextInt();
		}
		public void Display()
		{
			System.out.println("Students roll no is =" +rollno);
		}
	}
	 

		class Interface_Program4 {
		 
		 public static void main(String[] args)
		 {
			 Demo1 a= new  Demo2();
			 a.Accept();
			 a.Display();
			 Demo1 b= new Demo3();
			 a.Accept();
			 a.Display();
		 }
	
}
