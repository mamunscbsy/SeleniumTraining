package c_03_JavaIntro_Eclipse_DataType;

public class PracticeDataType {

	public static void main(String[] args) {

		System.out.println("Hello World");
		// Primative datatype
		int num = 7;
		double shoeSize = 8.5;
		char myInitial = 'M';
		System.out.println(num);
		System.out.println(shoeSize);
		System.out.println(myInitial);

		double result = num * shoeSize;
		System.out.println(result);
		System.out.println(num * shoeSize);

		// Non Primative datatype
		String myName = "Mamun";
		String sentence = "I am learning Java";
		myName.toLowerCase();
		System.out.println(myName.toUpperCase());
		System.out.println(myName.toLowerCase());
		System.out.println(myName.length());
		System.out.println(sentence.length());
		System.out.println(sentence.trim());
		System.out.println(sentence.contains("j"));

	}

}
