package learnCollections;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Map1 {

	public static void main(String[] args) {
		
		//Create a map that is create object of TreeMap class
		Map<String, String>	people = new TreeMap<String, String>();
		
		//Maintain Ascending order
		people.put("Bangladesh", "Dhaka");
		people.put("India", "New Delli");
		people.put("USA", "DC");
		people.put("UK", "London");
		
		System.out.println(people.size());
		
		people.get("UK");
		System.out.println(people.get("UK"));
		
		System.out.println(".........................");
		
		for(Entry<String, String> eachMp : people.entrySet()) {
      	  System.out.println(eachMp.getKey() + "," + eachMp.getValue());
        }
		
		System.out.println("..........................");
		
		//Create a map that is create object of HashMap class
		
		Map<String, String>	emp = new HashMap<String, String>();
		
		//Maintain Random order
		emp.put("Mohammed", "Amin");
		emp.put("Mahbuba", "Noor");
		emp.put("Sumaiya", "Chowdhury");
		emp.put("Kutub", "Uddin");
		emp.put("Sayed", "Ahmed");
		
		for(Entry<String, String> eachMp : emp.entrySet()) {
	      	  System.out.println(eachMp.getKey() + "," + eachMp.getValue());
	        }
		System.out.println(emp.size());
		
		people.get("Kutub");
		System.out.println(emp.get("Kutub"));
		}

}
