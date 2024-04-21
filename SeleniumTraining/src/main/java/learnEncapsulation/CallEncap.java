package learnEncapsulation;

public class CallEncap {
	public static void main(String[] args) {
		
		LearnEncapsulation obj = new LearnEncapsulation();
		//System.out.println(obj.atm);
		
		obj.getdata();
		
		
		obj.setPin(2121);
		
		System.out.println(obj.getdata());
	}


}
