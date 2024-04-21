package c_04_Class_Object_Method_MethodSignature;

import javaDemo.If_elseIf_else;

public class Methods {

	public static void main(String[] args) {
		// call a method inside the main method
		human();
		Name();
		printName("Mamun R Chowdhury");
		printName1("Mamun Chowdhury",3);
	}

	// create a method
	private static void human() {
		System.out.println("I am a human being");
	}
	//add two string
	private static void Name() {
		System.out.println("My name is " + "Mamun");
	}
	//Parameterized method
	private static void printName(String name) {
		System.out.println("My name is " + name);
	}
	
	private static String printName1(String name, int number) {
		System.out.println("My name is " + name);
		return "My name is " + name;
			
	}
	
	
}
