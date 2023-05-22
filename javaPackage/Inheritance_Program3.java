package javaPackage;

import java.util.Scanner;

	
	class Studentsss
	{
		Scanner Sc = new Scanner(System.in);
		int Sem, sub1, sub2, sub3, sub4, sub5, sub6, sub7, sub8, sub9,score;
		
	
			public void Accept()
			{

				System.out.println("Enter the Semister");
				Sem = Sc.nextInt();
				if (Sem==1)
				{
				System.out.println("Enter marks of English");
				sub1=Sc.nextInt();
				System.out.println("Enter marks of Sanskrit");
				sub2=Sc.nextInt();
				System.out.println("Enter marks of Marathi");
				sub3=Sc.nextInt();
				Display1();
				}
				
				
				else if(Sem==2) 
			{
				System.out.println("Enter marks of Hindi");
				sub4=Sc.nextInt();
				System.out.println("Enter marks of Geography");
				sub6=Sc.nextInt();
				System.out.println("Enter marks of History");
				sub6=Sc.nextInt();
				Display2();
}
				else
				{
					System.out.println("Enter marks of Algebra");
					sub7=Sc.nextInt();
					System.out.println("Enter marks of Geometry");
					sub8=Sc.nextInt();
					System.out.println("Enter marks of Science");
					sub9=Sc.nextInt();
					Display3();
				}									

				}
			public void Display1()
			{
				System.out.println("You have selected = " +Sem);
				System.out.println("Marks of English = " +sub1);
				System.out.println("Marks of Maths = " +sub2);
				System.out.println("Marks of Marathi = " +sub3);
			}
			public void Display2()
			{
					System.out.println("You have selected = " +Sem);
					System.out.println("Marks of Hindi = " +sub4);
					System.out.println("Marks of Geography = " +sub5);	
					System.out.println("Marks of History = " +sub6);
			}
			public void Display3()
			{
					System.out.println("You have selected = " +Sem);
					System.out.println("Marks of Algebra = " +sub7);
					System.out.println("Marks of Geometry = " +sub8);
					System.out.println("Marks of Science = " +sub9);
		}
	}
			class Results extends Studentsss
			{
				int percent;
				public void Total()
				{
					System.out.println("Enter the Semister to see the results");
					Sem = Sc.nextInt();
					if (Sem==1)
					{
						
						score=sub1+sub2+sub3;
						System.out.println("The Total of SEM1 =  " +score);
						percent=((score/300)*100);
						System.out.println("Percentage for SEM1 =" +percent);
				}
					else if (Sem==2)
					{
						
						score=sub4+sub5+sub6;
						System.out.println("The Total of SEM2 =  " +score);
						percent=((score/300)*100);
						System.out.println(percent);

				}
					else
					{
						
						score=sub7+sub8+sub9;
						System.out.println("The Total of SEM3 =  " +score);
						percent=((score/300)*100);
						System.out.println(percent);

					}
				}
			}
			public class Inheritance_Program3 {
				public static void main(String[] args)
				{
				
				Results s = new Results();
				s.Accept();
				
				s.Total();
				
			}
		}

			

	

	