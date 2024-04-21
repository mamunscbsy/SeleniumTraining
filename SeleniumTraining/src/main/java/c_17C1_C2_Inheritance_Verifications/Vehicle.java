package c_17C1_C2_Inheritance_Verifications;


public class Vehicle {  //Base/Super class
	
	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.applyBrake();
		obj.applyMirror();
		obj.applyHorn();
		obj.applyWheel();
		obj.applyMirror();
		obj.turnAC();
		obj.applyBrake();
		obj.absBrake();
		obj.startEngine();
		obj.stopEngine();
	}
	// Method related to vehicle
	public void applyWheel1() {
		System.out.println("I am from applyWheel1");
	}

	public void applyWheel() {
		System.out.println("I am from Apply Wheel");
	}
	public void applyHorn() {
		System.out.println("I am from Apply Horn");
	}
	
	public void applyBrake() {
		System.out.println("I am from Apply Brake");
	}
	
	public void applyMirror() {
		System.out.println("I am from Apply Mirror");
	}
	public void startEngine() {
        System.out.println("Engine started");
    }

    // Method related to vehicle
    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    // Method related to vehicle
    public void refuel() {
        System.out.println("Vehicle refueled");
    }
}
