package javaPackage;

import java.util.ArrayList;

public class ArrayList_Program2 {

	public static void main(String[] args) {
		
			ArrayList<Integer> Listname = new ArrayList<Integer>();
			ArrayList<Integer> L1 = new ArrayList<Integer>();
			L1.add(1);
			L1.add(2);
			L1.add(3);
			L1.add(4);
			L1.add(5);
			
			System.out.println("The List = " +L1);
			
			L1.set(2,100);
			System.out.println(L1);
	
	}

}
