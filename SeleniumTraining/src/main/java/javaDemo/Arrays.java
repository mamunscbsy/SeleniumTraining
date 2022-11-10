package javaDemo;

public class Arrays {

	public static void main(String[] args) {
		// Data Types:- 1. Primitive DataTypes and NonPrimitive DataType

				// num = 9600234
				//float, short, boolean, bit, byte

				short num0 = 1;
				
				int num1 = 10; 	
				long num2 = 11111111111111111l;

				double num3 = 10.10;
				float num4 = 10.10f;

				boolean num5 = false;
				char ch = 'p';
				
				int x =10;
				
			char y = 'a';
			
		String	z = "Hasan";
			

				//NonPrimitive Datatype (String, Arrays, Classes and Interfaces)
				
			String txt = "Atiq"; // data type


				// syntax for Arrays:
				// String [] names = {"yousuf", "shihab", "Mamun"};	
		//	String [] names = {"Atiq","Meem","Naz"};
			String [] list = {"book","book2","book3"};
			
			//1. How to store the values into Arrays(Note: Two ways available)
						
				// way-1- examples
			//int [] prices = {10,12,13,15,20,25};
			//String [] emp = {"Harun","Reza", "Daizy", "Touhid","Shipan","Sumaiya"};
			
			//Examples-1 (integer type)
			int [] id = {10,20,30,40,50,60}; //array.length
			
			//Get count of arrays -array.length
			System.out.println(id.length);
			System.out.println("................................");
			//Get particular value from arrays			
			System.out.println(id[3]);
			System.out.println(id[1]);
			System.out.println(id[5]);
			
			System.out.println("...................................");
			
			//Example-2 (String type)
			String[] names = {"milton", "shakil", "abcd", "lipee"}; 
				
			System.out.println(names.length);
			System.out.println(names[2]);
			
			//others examples
				//int[] ph = {123, 456, 789, 1 ,2 ,3 ,4};		
				//char[] ch1 = {'a', 'b', 'c', 'd'};
				
				//print ant particular value
					//System.out.println(names[2]);
			
				//how to get count of Array ---> array.lenght
					//System.out.println(names.length);
					//System.out.println(ph.length);*/

				//way-2	(using object)	
				//ClassName obj = new ClassName();
				
			//String[] names = new String[4];
			String [] emp = new String [5];
			//String [] emp1 = new String [6];
			emp[0]= "Reza";
			emp[1]= "Daisy";
			emp[2]= "Tushar";
			emp[3]= "Shakil";
			emp[4]= "Sumit";
			emp[5]= "Atik";
			
			/*String [] obj = new String[5];
				obj[0]=	"rumel";
				obj[1] = "rumi";
				obj[2] = "neepa";
				obj[3] = "xyz";
				obj[4] = "abc";*/
				//obj[5] = "mamun";
				
				//obj[5] = "Reza";
				//System.out.println(5);

				System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");

				//2. How to pick particular value from Array ---> array[indexNumber]		
				System.out.println(emp[4]);


				//3. how to get count of Array ---> array.lenght
				System.out.println(emp.length);
								
				System.out.println("**********************************************************");

					//for(i=0; i<=20; i++)
				//4. using for iterator, while loops and forEach		

				/*for (int i= 0; i <emp.length; i=i+1) {			
					System.out.println(emp[i]);
				}

				//String[] obj = new String[4];
				//obj[0] = "yousuf";
				//obj[1] = "shihab";
				//obj[2] = "Mamun";
				//obj[3] = "xyz";	

				//System.out.println("-------------------------------------------------------------");

				//1. For Each loop
			/*	for(String eachObj : obj) {			
					System.out.println(eachObj);
				}		

				System.out.println("-------------------------------------------------------------");

				//2. For loop		
				for(int i= 0 ; i <= 3; i++) {			
					System.out.println(obj[i]);
				}	*/	

				//System.out.println("-------------------------------------------------------------");

				//3.While loop		
				/*int i =0;
				while (i<=3) {				
					System.out.println(emp[i]);
					i++;
			}*/

	}
}
