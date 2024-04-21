package javaDemo;

public class Default {

	public static void main(String[] args) {
		/*The default keyword specifies some code to run if there is no case match:
		 Note that if the default statement is used as the last statement in a switch block, it does not need a break.
		 		 */
		//
		int day = 4;
	    switch (day) {
	      case 6:
	        System.out.println("Today is Saturday");
	        break;
	        default:
	      case 7:
	        System.out.println("Today is Sunday");
	        break;
	       case 8:
	        System.out.println("Looking forward to the Weekend");
	        break;
	    }  
	    //Scenario-2, Note: if the default statement is used as the last statement in a switch block, it does not need a break.
	    int day1 = 4;
	    switch (day) {
	      case 6:
	        System.out.println("Today is Saturday");
	        break;
	       
	      case 7:
	        System.out.println("Today is Sunday");
	        break;
	      default:
	        System.out.println("Looking forward to the Weekend");
	       
	    }  
	}

}
