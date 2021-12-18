package javaDemo;

public class ForEachLoop {

	public static void main(String[] args) {

		//for each loop
		//Syntax
				/*for(DataType eachCollections : Collection){
					Statement(eachCollections );
					}*/

	
		//print all values from below nums Arrays using for each loop.
		
		int[] nums = {10,20,30,40,50,60,70};
		
		for (int eachNums : nums) {
			
			System.out.println(eachNums);
					}

		System.out.println("...............................");
		
		//print all values from below names Arrays using for each loop.
		
		String[] names = {"rumel", "lipee", "abcd", "rosy","neepa","rumi","milton","Bely"};

		for(String eachNames : names ) {
		System.out.println(eachNames);
		}
	
		//we can print all values from nums Arrays by using for-loop too.
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
