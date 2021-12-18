package learnAbstractCalss;

public class Karim extends MobileUser {
	
	//both Call(), sendMessage(), methods internally comes here for inheritance concept]
	
	@Override
	void sendMessage() {
		System.out.println("Hi, I am Karim");
	}

}
