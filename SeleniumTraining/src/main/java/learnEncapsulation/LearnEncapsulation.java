package learnEncapsulation;

public class LearnEncapsulation {

	
		//Declare the pin as private
		private  int pin = 1234;
		
		private int atm = 213121242;
		
		
		public int getdata() {	//getter method
			return pin;
		}
		
		
		public void setPin(int pinNum) { //setter method
			this.pin = pinNum;
		}

		public static void main(String[] args) {
			
			LearnEncapsulation obj = new LearnEncapsulation();
			System.out.println(obj.atm);
			
			obj.getdata();
						
			obj.setPin(2121);
			
			System.out.println(obj.getdata());
			
		}


		public int getAtm() {
			return atm;
		}


		public void setAtm(int atm) {
			this.atm = atm;
		}


		public int getPin() {
			return pin;
		}

}
