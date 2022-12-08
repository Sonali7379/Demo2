package Com.Java;

import java.util.Scanner;

public class Test {
	static int a = 5;
	public static void main (String args []) {
		System.out.println(a);  // by value
		System.out.println(Test.a); // by class name
		// by create a object
		Test t = new Test();
		System.out.println(t.a);//s by object name;
		
	}
}
	
	