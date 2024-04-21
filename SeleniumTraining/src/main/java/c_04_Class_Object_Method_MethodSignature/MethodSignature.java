package c_04_Class_Object_Method_MethodSignature;

public class MethodSignature {
		
public static void main(String[] args) {
	
	addTwoNum(20, 30); //static methods we can directly called from main method(because main method is static)
	addTwoString("Hello"," World");
	
	//Syntax of object creation
	// className obj = new calssName();	
	
	Car obj = new Car();
		obj.driving();
		obj.CarBreak();
		obj.eat();
		obj.miror();
		obj.add(20, 20);
		//Car.addTwoNum(20, 25);
		//Car.addTwoString("I am", " driving");

}

//See below we have created two static method, and call directly inside static method(main method)
private static String addTwoString(String a, String b) {
	System.out.println(a+b);
	return a+b;	
}

private static int addTwoNum(int i, int j) {
	System.out.println(i+j);
	return i+j;
	
}

		
}