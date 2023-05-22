package javaPackage;
import java.util.Scanner;


			class Office
			{
				Scanner Sc = new Scanner(System.in);
				String name, city, Designation;
				int id, Salary, Incentive, Extra_hours_worked, Total;
				long Phoneno;
				public void Accept()
				{
					System.out.println("Enter the name of the Office");
					name = Sc.next();
					System.out.println("Enter the city of the Employee");
					city = Sc.next();
					}
				public void Display()
				{
					System.out.println("Name of the Office = " +name);
					System.out.println("City of the Employee = " +city);
				}
			}
			class Staff extends Office
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
					try
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
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
				public void Comments()
				{
					try
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
				
					catch(Exception e)
					{
						System.out.println(e);
					}
				
			}
			}
				class Consumer extends Office
				{
					public void Accept2()
					{
						System.out.println("The Name of the Consumer");
						name = Sc.next();
						System.out.println("The City of the Consumer");
						city = Sc.next();
						System.out.println("The Phone number of the Consumer");
						Phoneno = Sc.nextLong();
					}
					public void Display2()
					{
						System.out.println("Name of the Consumer = " +name);
						System.out.println("City of the Consumer = " +city );
						System.out.println("Phone Number of the Consumer = " +Phoneno);
					}
				}
				public class ExceptionHandlingInheritance_Demo {
					
					public static void main(String[] args)
					{
						Staff E = new Staff();
						E.Accept1();
						E.Display1();
						E.Calulate();
						E.Comments();
						
						Consumer C = new Consumer();
						C.Accept2();
						C.Display2();
					}
		}
			



	

