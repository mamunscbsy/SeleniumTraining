package c_17C1_C2_Inheritance_Verifications;

public class Test {

	
	public static void main(String[] args) {

		//If we create object of Car class, then we can only call Vehicle and Car class method, not BMW class methods.
		/*Car obj1 = new Car();
		obj1.turnAC();
		obj1.applyBrake();*/
		
		//create of object of BMW class
		BMW obj = new BMW();
		obj.applyMirror();
		obj.absBrake();
		obj.turnAC();
		obj.applyMirror();
		obj.applyHorn();
		obj.applyWheel();
		obj.turnAC();
		obj.applyBrake();
		obj.absBrake();
		obj.turnAC();
		
			}

}
