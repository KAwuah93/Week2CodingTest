package junglePackage;

public class Monkey extends Animal{
	
static int pride;
	
	Monkey(){
		super();
		pride++;
		this.name = "monkey";
		this.cry = "Ooh ooh Ahh ahh";
		this.energyLvl = 6;
	}
	
	@Override
	public void makeNoise() {
		super.makeNoise(4);
	}
	
	@Override
	public void sleep() {
		super.sleep(5);
	}
	
	public void eat() {
		super.eat(2);
	}
	
	void eat(String food) {
		if(food.equalsIgnoreCase("insects")) {
			System.out.println(this.name + " doesn't enjoy this food... at all, in fact it looks a bit sick");
			this.energyLvl-=2;
		} else if(food.equalsIgnoreCase("Banana")) {
			System.out.println(this.name + " Really enjoys the meal! bonus energy gained");
			this.energyLvl+=4;
		} else {
			super.eat();
		}
	}
	
	public int getPride() {
		return Monkey.pride;
	}
	
	void play() {
		if(this.energyLvl >= 8) {
		System.out.println("Oooo Oooo Oooo - Monkey Business ensues");
		this.energyLvl -= 8;
		} else {
			System.out.println("Monkey is too tired");
		}
		
	}

}
