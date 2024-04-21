package learnConstructor;

public class World {

	World(int a) { // Parameterized constructor
		System.out.println(a + 6);
	}

	public static void main(String[] args) {

		new World(10); // create object of World class

	}

}
