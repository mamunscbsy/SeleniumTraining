package learnConstructor;

public class Teacher {
	
	String name, gender;
	int phoneNo;
	
	Teacher (String n, String g, int p){ //Parameterized constructor
		name =n;
		gender = g;
		phoneNo = p;
	}
	void displayInfo () {
		System.out.println("name: "+ name);
		System.out.println("gender: "+ gender);
		System.out.println("phoneNo: "+ phoneNo);
	}	

	public static void main(String[] args) {

		Teacher teacher = new Teacher("Mamun Chowdhury","Male",682208424);
		teacher.displayInfo();
		
		Teacher teacher1 = new Teacher("Sumaiya Chowdhury","Female",682208423);
		teacher1.displayInfo();
	}

}
