package javaPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Program6 {

	public static void main(String[] args) {
		
	
	ArrayList<Integer> Listname = new ArrayList<Integer>();
	ArrayList<Integer> L1 = new ArrayList<Integer>();
	
	
	int a, b , c,  d, m ;

	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter the number you want to store");
	m = Sc.nextInt();
	
	System.out.println("Enter the First Number");
	a=Sc.nextInt();
	L1.add(a);

	System.out.println("Enter the Second Number");
	b=Sc.nextInt();
	L1.add(b);

	System.out.println("Enter the Third  Number");
	c=Sc.nextInt();
	L1.add(c);

	System.out.println("Enter the Forth Number");
	d=Sc.nextInt();
	L1.add(d);

	L1.set(2,100);
	System.out.println(L1);

	L1.remove(2);
	System.out.println(L1);	
	System.out.println(L1);
}

}



