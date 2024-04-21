package javaDemo;

public class Car1 {

	public static void main(String[] args) {


		driving();

		//Object of Car1 Class:
		
		Car1 obj = new Car1();
		
		obj.horn();
		obj.mirror();
		obj.color();
	}

	public static void driving() {
		System.out.println();
		System.out.println("I am driving");
		System.out.println("I am driving");
		System.out.println("I am driving");
		System.out.println("I am driving");
	}
	private void horn() {
		System.out.println("Horn");
	}
	
	void mirror() {
		System.out.println("Mirror");
	}
	protected void color() {
		System.out.println("color");
	}
}
