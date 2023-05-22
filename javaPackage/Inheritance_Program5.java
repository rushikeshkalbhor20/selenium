package javaPackage;

import java.util.Scanner;

	
	class Company
	{
		Scanner Sc = new Scanner(System.in);
		String name, city, Designation;
		int id, Salary, Incentive, Extra_hours_worked, Total;
		long Phoneno;
		public void Accept()
		{
			System.out.println("Enter the name of the Company");
			name = Sc.next();
			System.out.println("Enter the city of the Employee");
			city = Sc.next();
			}
		public void Display()
		{
			System.out.println("Name of the Company = " +name);
			System.out.println("City of the Employee = " +city);
		}
	}
	class Employee extends Company
	{
		public void Accept1()
		{
			System.out.println("Enter the Name of the Employee");
			name = Sc.next();
			System.out.println("Enter the ID of the Employee");
			id = Sc.nextInt();
			System.out.println("Enter the City of the Employee");
			city = Sc.next();
			System.out.println("Enter the Designation of the Employee");
			Designation = Sc.next();
			System.out.println("Enter the Salary of the Employee");
			Salary = Sc.nextInt();
			System.out.println("Enter the Incentive of the Employee");
			Incentive = Sc.nextInt();
			System.out.println("Enter the Extra_hours_worked of the Employee");
			Extra_hours_worked = Sc.nextInt();

		}
		public void Display1()
		{
			System.out.println("The Name of the Employee = " + name);
			System.out.println("The ID of the Employee = " +id);
			System.out.println("The City of the Employee = " +city);
			System.out.println("The Designation of the Employee = " +Designation);
			System.out.println("The Salary of the Employee = " +Salary);
			System.out.println("The Incentive gained by the Employee = " +Incentive);
			System.out.println("The Extra_hours_worked by the Employee = " +Extra_hours_worked);
			
		}
		public void Calulate()
		{
			
			if (Extra_hours_worked<5)
			{
				Total=Salary+Incentive;
				System.out.println("Salary = " +Salary+ " And Incentive Recieved = "+Incentive+ " Total Salary is = " +Total);
				}
			else if (Extra_hours_worked>3)
			{
				Total=Salary+Incentive;
				System.out.println("Salary = " +Salary+ " And Incentive Recieved = "+Incentive+ " Total Salary is = " +Total);
				
				}
			else
			{	
				Total=Salary+Incentive;
				System.out.println("Salary = " +Salary+ " And Incentive Recieved = "+Incentive+ " Total Salary is = " +Total);
			}
		}
		public void Appreciation()
		{
			if (Total<90000)
			{
				System.out.println("Comments = Great Work");
			}
			else if (Total<6000)
			{
				System.out.println("Comments = Doing Great but Need to Improve");
			}
			else
			{
				System.out.println("Comments = Need to work very hard");
				
				}
		}
		
	}
		class Client extends Company
		{
			public void Accept2()
			{
				System.out.println("The Name of the Client");
				name = Sc.next();
				System.out.println("The City of the Client");
				city = Sc.next();
				System.out.println("The Phone number of the Client");
				Phoneno = Sc.nextLong();
			}
			public void Display2()
			{
				System.out.println("Name of the Client = " +name);
				System.out.println("City of the Client = " +city );
				System.out.println("Phone Number of the Client = " +Phoneno);
			}
		}
		public class Inheritance_Program5 {
			
			public static void main(String[] args)
			{
				Employee E = new Employee();
				E.Accept1();
				E.Display1();
				E.Calulate();
				E.Appreciation();
				
				Client C = new Client();
				C.Accept2();
				C.Display2();
			}
}

