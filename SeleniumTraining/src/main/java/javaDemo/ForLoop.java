package javaDemo;

public class ForLoop {

	public static void main(String[] args) {
		
		//print 1 to 10
		for(int i=1; i<=10;i=i+1) {
			System.out.println(i);
		}
		System.out.println("*****************************************************");
		
		for(int j=1; j <= 50; j=j+2) {
			System.out.println(j);
		}

System.out.println("*****************************************************");

		//Print all the values from below Arrays (obj) by using while loop
		String[] obj = new String[6];
		obj[0] = "Atiq";
		obj[1] = "Meem";
		obj[2] = "Rosy";
		obj[3] = "Shafin";
		obj[4] = "Mamun";
		obj[5] = "xyz";

		//By using loops we can performs various actions/thing

		for(int i=0;i<obj.length; i=i+1) {

			//System.out.println(i);	//For printing all index number

			//System.out.println(i +" United State of America"); //printing "United State of America"multiple times with index number 
			System.out.println(obj[i]); // Printing all values from array 
		}	

	}	
}
