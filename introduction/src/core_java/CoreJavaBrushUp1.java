package core_java;

import java.util.Iterator;

public class CoreJavaBrushUp1 {
	
	public static void main(String[] args) {
		
		// Data Types
		
		int myNum = 5; // Primitive
		String website = "Rahul Shetty Academy"; // Non-primitive
		char letter = 'r';
		double fdata = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum + "is the value stored in the myNum variable");
		System.out.println(website);
		
		
		// Arrays
		
		int[] sample = new int[5];
		sample[0] = 1;
		sample[1] = 2;
		sample[2] = 3;
		sample[3] = 4;
		sample[4] = 5;
		
		for (int i = 0; i < sample.length; i++) {
			
			System.out.print(" " + sample[i]);
		}
		
		System.out.println();
		
		//********************************
		
		
		int[] a = {1,2,3,4,5};
		
		System.out.println(a[1]);
		
		System.out.println();
		
		for (int i : a) {
			System.out.print(i);
		}
		
		System.out.println();
		
		//********************************
		
		
		String art = "Interviews_in_Atos";
		
		int temp = 0;
		for (int i = 0; i < art.length(); i++) {
			if (art.charAt(i) == 'I')  {
				temp += 1;
			}
			else if (art.charAt(i) == 'i') {
				temp += 1;
			}
		}
		
		System.out.println(temp);
		
		
	}

}
