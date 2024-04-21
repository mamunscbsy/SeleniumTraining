package c_08C1_C2_Arrays_If_Else_ElseIf;

public class If_Else_ElseIf_Examples {

	public static void main(String[] args) {

		//Scenario-1 condition true. [Print "Hello World" if A is greater than B.]
		int A = 50;
		int B = 30;
		if(A>B) {
			System.out.println("Hello world");
		}
		//Scenario-2,Print "Welcome to Selenium class" if x is equal to y.		
		int x =25;
		int y = 25;
		if(x==y) {
			System.out.println("Welcome to Selenium class");
		}
		//Scenario-3,Print "Yes" if C is equal to D, otherwise print "No".
		int C = 20;
		int D = 20;
		if(C==D) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		//Scenario-4,Print "1" if E is equal to F, print "2" if E is greater than F, otherwise print "3".

		int E = 40;
		int F = 40;

		if(E==F) {
			System.out.println("1");
		}
		if(E>F) {
			System.out.println("2");
		}
		else {
			System.out.println("3");
		}
	}

}
