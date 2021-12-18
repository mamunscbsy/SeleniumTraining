package javaDemo;

public class ForLoop {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=50; i=i+1) {
			System.out.println(i);
		}
		//Print all the values from below Arrays (obj) by using while loop
				String[] obj = new String[4];
				obj[0] = "Rumman";
				obj[1] = "shihab";
				obj[2] = "Mamun";
				obj[3] = "xyz";
		
				for(int i=0;i<=3; i=i+1) {
			//System.out.println(i);
			
			//System.out.println(i +" United State of America");
			System.out.println(obj[i]);
			
		}
		
	 
		 }
	
}
