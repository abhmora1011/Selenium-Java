package core_java;

import java.util.ArrayList;
import java.util.Collections;

public class CoreJavaBrushUp2 {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10,122};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				break;
			}
			else {
				System.out.println(a[i] + "");
			}
		}
		
		//*************************************
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println(cars.get(2));
	    System.out.println(cars.set(2, "Honda"));
	    System.out.println(cars);
	    cars.add("Beat");
	    System.out.println(cars);
	    cars.remove(2);
	    Collections.sort(cars);
	    System.out.println(cars);
	    cars.size();
	    cars.clear();
	}

}
