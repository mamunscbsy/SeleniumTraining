package javaDemo;

public class Car {
	
	public void driving() {
		
		System.out.println("I am Driving"); //method Body
	}

	private void horn() {
		System.out.println("My car horn is vry good");
	}
	
	 void CarBreak() {
		System.out.println("Car has break");
	}
	
	protected void miror() {
		System.out.println("Car has mioor");
	}
	public void tipu() {
		System.out.println("My name is Tipu");
	}
	private void rumman() {
		System.out.println("Rumman learns java well");
	}
	void eat() {
		System.out.println("I am eating");
	}
	
	protected void java() {
		System.out.println("We ar learning Java");
		
	}

	public void add(int a, int b) { //parameterized methods, because we pass two arguments in this method
		System.out.println(a+b);
		
	}
	//Below is the example of static methods, and don't need to create object of static methods
	public static void addTwoNum(int c, int d) {
		System.out.println(c+d);
	}
	//return type
	public static String addTwoString(String x, String y) {
		return x+y;
		}

}
