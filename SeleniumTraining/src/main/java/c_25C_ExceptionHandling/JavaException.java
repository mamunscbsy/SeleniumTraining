package c_25C_ExceptionHandling;

public class JavaException {

	public static void main(String[] args) {


		int i, j, k=0;
		i=8;
		j=0;
		try {
		k=i/j; //output will be infinite, but in programming language we don't use infinite, we called exception 
		}
		//catch(ArithmeticException e) { //we can specify the exception
		catch(Exception e) {
		System.out.println(e);
	}
		System.out.println(k);
	}
}
