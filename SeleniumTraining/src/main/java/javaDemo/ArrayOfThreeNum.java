package javaDemo;

public class ArrayOfThreeNum {

	public static void main(String[] args) {

		int a[] = {1,2,3};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum=a[1]+sum;
		}
System.out.println(sum);
	}

}
