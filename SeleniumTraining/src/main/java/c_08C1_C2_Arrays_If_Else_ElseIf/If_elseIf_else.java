package c_08C1_C2_Arrays_If_Else_ElseIf;

public class If_elseIf_else {

	public static void main(String[] args) {
		
		//D = 5, Diabetic, 5.5 = Pre Diabetic, D < 5= Non Diabetic
		
		//Scenario-1
		double D = 5.5; 

		if(D <= 5) {
			System.out.println("Diabetic");

		}
		else if(D < 5){
			System.out.println("Non Diabetic");
			
		}
		else if(D > 8){
			System.out.println("Poor Control");
		}

		else {
			System.out.println("Pre Diabetic");
		}
		
		System.out.println("*******************************************************");
		
		//Scenario - 2
		int x = 20;
		
		if(x > 21) {
			System.out.println("x less than 21");
		}
		else if (x < 19) {
			System.out.println("x is less than 18");
		}
		else if(x > 25) {
			System.out.println("x greatyer than 26");
		}else {
			System.out.println("x euqal to 20");
		}

	}

}
