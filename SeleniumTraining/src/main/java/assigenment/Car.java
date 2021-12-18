package assigenment;

public class Car {

	public static void main(String[] args) {
		
		//classNmae object = new calssName(); //object creation syntax
		//Why we need to create a object of a class? For call non static methods from static method under the same class.
		Car obj = new Car();
		
		obj.carHorn();
		obj.wheel();
		obj.Brake();
		obj.ac();
		}	
		//Parametrizate method
	
	/*public void carHorn(String color,String body) {
		System.out.println("My car has very good horn");
		
		//return color + body;
	}*/
	
	public void carHorn() {
		System.out.println("My car has very loud horn");
		}
	void wheel() {
		System.out.println("My car wheel is Awesome");
	}
	private void Brake() {
		System.out.println("My car brake is very hard");
	}
	protected void ac() {
		System.out.println("My car AC performance is excellent");
	}
}