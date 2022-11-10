package learnInheritance;


public class Vehicle {  //Base/Super class
	
	/*public static void main(String[] args) {
		BMW obj = new BMW();
		obj.applyBrake();
		obj.applyMirror();
		obj.applyHorn();
		obj.applyWheel();
		obj.applyMirror();
		obj.turnAC();
		obj.applyBrake();
		obj.absBrake();
	}*/
	
	public void applyWheel1() {
		System.out.println("applyWheel1");
	}

	public void applyWheel() {
		System.out.println("Apply Wheel");
	}
	public void applyHorn() {
		System.out.println("Apply Horn");
	}
	
	public void applyBrake() {
		System.out.println("Apply Brake");
	}
	
	public void applyMirror() {
		System.out.println("Apply Mirror");
	}

}
