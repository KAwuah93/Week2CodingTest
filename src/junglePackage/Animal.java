package junglePackage;

public class Animal {

	static int pride;
	protected String name;
	protected String cry;
	protected int energyLvl;
	protected int prideCount;
	
	
	public Animal() {
		this.name = "Animal";
		this.cry = "Chattttter";
		this.energyLvl = 5;
	}
	public Animal(String name) {
		this.name = name;
		this.cry = "Chattttter";
		this.energyLvl = 5;
	}
	
	public void makeNoise() {
		if(this.energyLvl >= 3) {
		System.out.println(this.name +" makes a noise! (" + cry + ")");
		this.energyLvl-=3;
		}else {
			System.out.println(this.name + " is too tired to make noise, feed it or let it rest!");
		}
	}
	//Overloaded Method for checking
	public void makeNoise(int sub) {
		if(this.energyLvl >= sub) {
			System.out.println(this.name +" makes a noise! (" + cry + ")");
			this.energyLvl-=sub;
			}else {
				System.out.println(this.name + " is too tired to make noise, feed it or let it rest!");
			}
	}
	
	public void sleep() {
		System.out.println(this.name +" has gone to sleep");
		this.energyLvl+=10;
	}
	
	//substituting the number in
	public void sleep(int sub) {
		System.out.println(this.name +" has gone to sleep");
		this.energyLvl+=sub;
	}
	
	
	public void eat() {
		System.out.println(this.name +" consumed the food it was given");
		this.energyLvl+=5;
	}
	
	//version of the food function that lets you get 
	public void eat(int sub) {
		System.out.println(this.name +" consumed the food it was given");
		this.energyLvl+=sub;
	}
	
	//
	public void condition() {
		System.out.println( this.name + " has: "+ this.energyLvl + " energy left");
	}
	
	public int getPride() {
		return pride;
	}

	
}
