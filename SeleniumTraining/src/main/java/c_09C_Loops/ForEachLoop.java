package c_09C_Loops;

public class ForEachLoop {

	public static void main(String[] args) {

		//for each loop
		//Syntax
		/*for(DataType eachCollections : Collection){
					Statement(eachCollections );
					}*/
		
		String [] Args= {"Meem", "Javed", "Mamun"};

		for (String eachArgs : Args) {
			System.out.println(eachArgs);
		}
		
		//print all values from below nums Arrays using for each loop.
		//Example-1
		int[] nums = {10,20,30,40,50,60,70};

		for (int eachNums : nums) {

			System.out.println(eachNums);
		}
			System.out.println(nums.length);
			
		System.out.println("...............................");

		//print all values from below names Arrays using for each loop.
		//Example-2

		String[] namess = {"rubel", "shewlee", "abcd", "rinku","neepa","rumi","mamun","bely"};

		for(String eachNames : namess ) {
			System.out.println(eachNames);
		}
		System.out.println(".................................");

		//print all values from below emp Arrays using for each loop.
		//Example-3
		String[] emp = new String[4];
		emp[0] = "Rumman";
		emp[1] = "shihab";
		emp[2] = "Mamun";
		emp[3] = "xyz";

		for(String eachEmp : emp ) {
			System.out.println(eachEmp);
		}
		System.out.println(".....................................");

		String[] names = new String[4];
		names[0] = "Sarwath";
		names[1] = "Eva";
		names[2] = "Mamun";
		names[3] = "Tasnim";
		
	for (String eachNames : names) {
		System.out.println(eachNames);
	}
		
		//we can print all values from nums Arrays by using for-loop too.
		for (int i = 0; i <nums.length ; i++) {
			System.out.println(nums[i]);
		}
	}

}
