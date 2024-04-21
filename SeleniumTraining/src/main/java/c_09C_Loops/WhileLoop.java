package c_09C_Loops;

public class WhileLoop {

	public static void main(String[] args) {
		
		//while loop

		/*initializan;
		while(condition){
		Statement(s);
		incerment;
		}*/
		
		//If I will print 1 to 10, using While loop
		
		int i=1; // start
		while(i<=10) {
			System.out.println(i);
			i++; //increment
		}
		
		System.out.println("...........................");
		
		//Print all the values from below Arrays (obj) by using while loop
		String[] obj = new String[4];
		obj[0] = "Rumman";
		obj[1] = "shihab";
		obj[2] = "Mamun";
		obj[3] = "xyz";
		
	int j=0;
		while(j<=3) {
			System.out.println(obj[j]);
			j++;
		}
}
}