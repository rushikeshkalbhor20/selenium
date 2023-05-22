package javaPackage;

public class SwitchLoop_Program3 {

	public static void main(String[] args) {
		
		char choice = 'f';
		if (choice>='g')
		{
			System.out.println("Choice is invalid");
		}
		switch (choice)
		{
		case 'a': System.out.println("A/a is a vowel");
		break;
		
		case 'b': System.out.println("E/e is a vowel");
		break;
		
		case 'c': System.out.println("I/i is a vowel");
		break;
		
		case 'd': System.out.println("O/o is a vowel");
		break;
		
		case 'e': System.out.println("U/u is a vowel");
		break;
		
		case 'f': System.out.println("E/e is a vowel");
		break;
		}
	}

}
