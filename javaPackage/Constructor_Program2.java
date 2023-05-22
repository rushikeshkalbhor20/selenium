package javaPackage;

public class Constructor_Program2 {
	
		int id; // Global Variable
		String name; // Global Variable
		String address; // Global Variable
		
		//Parameterized Constructor
		Constructor_Program2()
		{
			System.out.println("Hello Default Constructor");
		}
		// Parameterized Constructor
		Constructor_Program2(int a, String b, String c)
	{
			this.id = a;
			name = b;
			address = c;
			
	}
		//Non Static Method
		public void displayInfo()
		{
			//System.out.println(id + "  " + name + "   " + address);
		}
		public static void main(String[] args)
		{
			//Default Constructor
			Constructor_Program2 c2 = new Constructor_Program2();
			
			//Parameterized Constructor
			Constructor_Program2 c3 = new Constructor_Program2(1,"John","Pune");
			c3.displayInfo();
			
			Constructor_Program2 c4 = new Constructor_Program2(2,"Rahul","Delhi");
			c4.displayInfo();

			}

		}

