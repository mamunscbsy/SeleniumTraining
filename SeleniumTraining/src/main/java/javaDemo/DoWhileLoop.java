package javaDemo;

public class DoWhileLoop {
	
	public static void main(String[] args) {

		//do while loop
		
		/*initializan;
		do{
		Statement(s);
		increment;
		}while(condition);*/

		//It will print 1 to 10, using do while loop
		//if you don't use increment [i++] in while or do while loop, it will run infinite times, that is it will never ends
		
		int i=1; //start
		do {
			System.out.println(i);
			i++;
		}while(i<=10);

	}

}
