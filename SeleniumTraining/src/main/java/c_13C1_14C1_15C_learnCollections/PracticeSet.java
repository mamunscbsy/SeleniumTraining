package c_13C1_14C1_15C_learnCollections;

import java.util.Set;
import java.util.TreeSet;

public class PracticeSet {

	public static void main(String[] args) {

		Set<String> emp = new TreeSet<String>();
		
		emp.add("neepa");
		emp.add("mahbub");
		emp.add("mahbub");
		emp.add("xyz");
		emp.add("yousuf");
		emp.add("shihab");
		emp.add("mamun");
		emp.add("emad");
		emp.add("eeepa");
		
		//3. print/display all items in the Set -use foreach

				for (String eachemp : emp) {
					System.out.println(eachemp);
				}

	}

}
