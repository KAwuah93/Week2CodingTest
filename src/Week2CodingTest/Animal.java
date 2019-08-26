package Week2CodingTest;

public class Animal {
	private int energy;
	private String cry;
	
	void sleep(){
		this.energy+=10;
	}
	
	void cry(){
		System.out.println("This animal goes: " + this.cry);
		this.energy-=3;
	}
	
	void eat() {
		this.energy+=3;
	}

}
