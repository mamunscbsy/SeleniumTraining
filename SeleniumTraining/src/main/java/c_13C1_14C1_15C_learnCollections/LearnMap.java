package c_13C1_14C1_15C_learnCollections;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import javaDemo.ForEachLoop;

public class LearnMap {

	public static void main(String[] args) {
		
		//Map (2 dimension)
		
		//Create a map that is create object of LinkedHashMap class
		
		//Maintains Order of put/Insert
	
      // Map<String, Integer> mp = new LinkedHashMap<String, Integer>(); // Result order depends on Implementation classes
	Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
       //Add entry in a Map- use put()
		mp.put("Eva", 101);
		mp.put("Meem", 113);
		mp.put("Mamun", 112);
		mp.put("Touhid", 111);
		mp.put("Harun", 123);
		mp.put("Rubel", 682);
		mp.put("Shewlee", 347);
		mp.put("Faihan", 347);
		mp.put("Abc", 123);
		mp.put("Musaddik", 444);
		mp.put("Rosi", 222);
		mp.put("Sayed", 555);
		mp.put("Touhid", 007);
		mp.put("Abc", 124);
		
		 /* Syntax: 
		  for(datatype eachMap : Collection){
        		Sysout(eachMap);
        		}*/
	
          //It will print all Entry of Map
       for (Entry<String, Integer> eachMP : mp.entrySet()) {
        	 System.out.println(eachMP.getKey() + " " + eachMP.getValue());
     	
      		}
                        
       // System.out.println(".........................");   
        
          // get count of Map entry -size()
        System.out.println(mp.size());
          
        
         System.out.println(".........................");
          
          //get(); // It will print value of 'Shewlee' Key
         mp.get("Shewlee");
     
       System.out.println(mp.get("Shewlee"));
          
        //Remove()-a particular item- remove key with value
        mp.remove("Harun"); // just pass the Key
          
         
         System.out.println(".........................");
          
          //After remove 'Harun' Size of Map
        System.out.println(mp.size());
          
      //After remove 'Harun' remaining entries of Map
        for (Entry<String, Integer> eachMP : mp.entrySet()) {
      	  System.out.println(eachMP.getKey() +"   "+ eachMP.getValue());
			
		}
          //System.out.println(".........................");
          
          //ContainsKey()-Search by the Key
      mp.containsKey("Shewlee");
        System.out.println(mp.containsKey("Shewlee")); //true/false
          
          System.out.println(".........................");
          
          //ContainsValue- Search by Value
      //   mp.containsValue(555);
         System.out.println(mp.containsValue(122));
       //System.out.println(mp.containsValue(444));  //true/false
          
          //clear()- all map items
        mp.clear(); //It will remove all Map entries
          
          System.out.println(".........................");
          
         System.out.println(mp.size()); //size will be zero
          
          //System.out.println(".........................");
          
          System.out.println(mp.isEmpty()); //true/false
        
          System.out.println("..................");
          
          for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "    " + eachMp.getValue());
          } // result-Map entry will be nil
          
          
          
          
          
          
         // for Each loop (Single dimension-List & Set)
          
         /* for(datatype VariableName : Collection) { // collection = List or Set
        	  
          }
          */
          
          
          
        /*  for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "   " + eachMp.getValue());
          }*/

	}

}
