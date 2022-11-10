package javaDemo;

public class StringConcept {

	public static void main(String[] args) {
		
				String text = "String Concept";
				String text1 = "String Concept1";
				System.out.println(text);
				System.out.println(text1);
				
				//Find the memory location/address of this text/text1 variable	
				//System.out.println(System.identityHashCode(text));
				System.out.println(System.identityHashCode(text));
				System.out.println(System.identityHashCode(text1));
				
				
				System.out.println(text);
				System.out.println(text1);
				
				//String class Method
				//1. equals() -return true or false
				System.out.println(text.equals(text1));
				//System.out.println(text.equals(text1));//equals function compare the value of two different variable(text & text1)
				
				System.out.println("-----------------------------");
				System.out.println(text == text1); //compares memory address/location of String variable
				
				System.out.println(System.identityHashCode(text));
				System.out.println(System.identityHashCode(text1));
				
				//2. Length()- return count of String
				//String text = "String Concept  ";
				String text2 = "Learning String";
				System.out.println(text2.length());
				
			//"I am" + "Mamun"; I am Mamun
				//3. Concat()- if you want to Concat (join more than one Strings) two String
				
				System.out.println(text.concat(text2)); 
					
				//If you want to concat different datatype variable, we use + 
					String num = "20";
					//String num1 ="30";
					int a = 10;
					int b = 20;
					System.out.println(num + a);
					
					System.out.println(a+b);
							
				//4. trim()- want to remove white space from both side of a String use- trim()
				String line = "    Java String concept    ";
					System.out.println(line);
					System.out.println(line.length());
					System.out.println(line.trim());
					//After use -trim()
					System.out.println(line.trim().length());
					System.out.println(line.length());
										
				//5. toLowerCase()- convert all of the String as LowerCase()
					String text4 = "Compares String";
					System.out.println(text4.toLowerCase());
								
					//toUpperCase()- convert all of the String as UpperCase()
					String text5 = "Compares String";
					System.out.println(text5.toUpperCase());
									
					
					//6.contains() -given String is available in entire String or not - return true/false
					System.out.println(text5.contains("mpa"));
					System.out.println(text5.contains("tex"));
					System.out.println(text5.contains("tring"));				

	}

}
