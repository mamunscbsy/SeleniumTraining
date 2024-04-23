package c_09C_Loops;

public class ForLoop {

	public static void main(String[] args) {
		
		//print 1 to 10 number
		/*for (int i = 1; i<=20; i=i+1) {
			System.out.println(i);
		}*/
		
		for (int i=1; i<=15;i=i+1) {
			System.out.println(i);
		}
		
		System.out.println("*****************************************************");
		//print all odd number from 1 to 20
		for (int i = 1; i<=20; i=i+2) {
			System.out.println(i);
		}
		System.out.println("*****************************************************");
		
		//Print all even numbers from 0 to 50
		for(int j=0; j <= 50; j=j+2) {
			System.out.println(j);
		}

System.out.println("*****************************************************");

		//Print all the values from below Arrays (obj) by using for loop
		String[] obj = new String[6];
		obj[0] = "Rinku";
		obj[1] = "Rubel";
		obj[2] = "Shewlee";
		obj[3] = "Ekram";
		obj[4] = "Wadud";
		obj[5] = "xyz";

		//By using loops we can performs various actions/thing
		//for (int i = 0; i<6;i=i+1) {
		//}
		for(int i=0;i<obj.length; i=i+1) {
			System.out.println(i);
			//System.out.println(i);	//For printing all index number

			//System.out.println(i +" United State of America"); //printing "United State of America"multiple times with index number 
			//System.out.println(obj[i]); // Printing all values from array 
		}	

	}	
}
