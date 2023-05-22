package javaPackage;

import java.util.ArrayList;

public class ArrayList_Program4 {

	public static void main(String[] args) {
		
		ArrayList<String> Listname = new ArrayList<String>();
		ArrayList<String> L1 = new ArrayList<String>();
		L1.add("a");
		L1.add("b");
		L1.add("c");
		L1.add("d");
		L1.add("e");
		
		System.out.println("The List = " +L1);
		
		L1.set(2,"abc");
		System.out.println(L1);
		
		L1.remove(2);
		System.out.println(L1);
	
}

}

