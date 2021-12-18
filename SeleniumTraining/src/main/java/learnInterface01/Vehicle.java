package learnInterface01;

public interface Vehicle {
	
	void horn();//complier automatically consider as public abstract
	
	void color();
	
	void turnAC();
	

	public abstract void brake();//you can write "public abstract" or not
	
	void mirror();
	
	void heatedSeat();
	
}
