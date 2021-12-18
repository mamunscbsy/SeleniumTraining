package learnCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	//Set is not order based
	public static void main(String[] args) {


		//Set<Integer> obt = new TreeSet<Integer>();
		//Set<Integer> obj = new HashSet<Integer>();

		//Set<Integer> obj = new HashSet<Integer>();

		//Set<Integer> obj = new TreeSet<Integer>();
		Set<Integer> obj = new LinkedHashSet<Integer>();


		//1. add items in Set- use add()
		obj.add(124);
		obj.add(101);
		obj.add(125);
		obj.add(721);
		obj.add(123);
		obj.add(456);
		obj.add(101112);
		obj.add(789);
		obj.add(123);
		//obj.add(000);
		obj.add(789);

		//2. Get count of Set- use size()
		System.out.println(obj.size());


		System.out.println("..................................");

		//3. print/display all items in the Set -use foreach

		for (Integer eachobj : obj) {
			System.out.println(eachobj);
		}


		System.out.println("****************");



		//4. Check particular item from set- use contains() -output-true/false
		System.out.println(obj.contains(101113));

		System.out.println("****************");

		//5. delete item from Set - use remove(item)
		obj.remove(101112);

		System.out.println(obj.contains(101112));

		//After delete -Print all item from Set
		for (Integer eachInt : obj) {
			System.out.println(eachInt);
		}

		//System.out.println("****************");

		//after delete item
		//System.out.println(obj.size());

		//System.out.println("****************");

		//System.out.println(obj.contains(123));

		//System.out.println(obj.contains(101112));

		//System.out.println("****************");

		//	6. Remove all items from Set - use obj.clear()
		obj.clear();


		//7. Confirm set is Empty or not- use isEmpty()- output- true/false
		System.out.println(obj.isEmpty());

	}

}
