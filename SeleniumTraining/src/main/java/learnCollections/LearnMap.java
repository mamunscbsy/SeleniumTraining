package learnCollections;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		//Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		
          //Map<String, Integer> mp = new LinkedHashMap<String, Integer>();// Result order depends on Implementation classes
		mp.put("Mamun", 112);
		mp.put("Ashraf", 111);
		mp.put("Emad", 123);
		mp.put("Hasan", 682);
		mp.put("Nilufar", 347);
		mp.put("Abc", 123);
		mp.put("Nilufar", 444);
		mp.put("Hasan", 222);
		mp.put("Mahtab", 555);
		mp.put("Ashraf", 007);
		mp.put("Abc", 124);
       
         /* Syntax: for(datatype MapName : Collection){
        		Sysout(MapName);
        		}*/
          
      /*  for (Entry<String, Integer> eachMP : mp.entrySet()) {
        	  System.out.println(eachMP.getKey() +"   "+ eachMP.getValue());
			
		}*/
          
              
       /*  System.out.println(".........................");              
          // get count of Map entry -size()
         System.out.println(mp.size());
          
        
         System.out.println(".........................");
          
          //get();
        System.out.println(mp.get("Nilufar"));
          
        //Remove()
         mp.remove("Emad"); // just pass the Key
          
         
         System.out.println(".........................");
          
          //after remove Size of Map items
        System.out.println(mp.size());
          
        for (Entry<String, Integer> eachMP : mp.entrySet()) {
      	  System.out.println(eachMP.getKey() +"   "+ eachMP.getValue());
			
		}
          //System.out.println(".........................");
          
          //ContainsKey()-Search by the Key
        mp.containsKey("Nilufar");
        System.out.println(mp.containsKey("Nilufar")); //true/false
          
          System.out.println(".........................");
          
          //ContainsValue- Search by Value
          mp.containsValue(444);*/
       // System.out.println(mp.containsValue(444));  //true/false
          
          //clear();
        mp.clear(); //Removes all Map entry
          
          System.out.println(".........................");
          
         System.out.println(mp.size()); //size will be zero
          
          //System.out.println(".........................");
          
          System.out.println(mp.isEmpty()); //true/false
        
          System.out.println(".........................");
          
          for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "    " + eachMp.getValue());
          } // result-Map entry will be nil
          
          
          
          
          
          
         // for Each loop (Single dimension-List & Set)
          
         /* for(datatype VariableName : Collection) { // collection = List or Set
        	  
          }
          */
          
          //Map (2 dimension)
          
        /*  for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "   " + eachMp.getValue());
          }*/

	}

}
