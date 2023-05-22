package javaPackage;

public class SwitchLoop_Program2 {

	public static void main(String[] args) {
		
		int  a=5,b=15,c;
		int choice = 4;
		if (choice>=5)
		{
			System.out.println("Choice is not valid");
		}
		switch(choice)
		{
		case 1: System.out.println("Addition is in process");
				c=a+b;
				System.out.println(c);
				break;
		
		case 2: System.out.println("Subtraction is in process");
				c=a-b;
				System.out.println(c);
				break;

		case 3: System.out.println("Multipliation is in process");
				c=a*b;
				System.out.println(c);
				break;

		case 4: System.out.println("Division is in process");	
				c=a%b;
				System.out.println(c);
				break;
		}
	}

}
