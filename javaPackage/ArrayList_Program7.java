package javaPackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Program7 {

		public static void main(String[] args) {
					
			ArrayList<String> l1 = new ArrayList<String>();
			l1.add("R");
			l1.add("A");
			l1.add("I");
			l1.add("N");
			l1.add("B");
			l1.add("O");
			l1.add("W");
			
			System.out.println("Before Reversing " +l1);
			Collections.reverse(l1);
			System.out.println("After Reversing" +l1 );
			
	
				
			}
		}

