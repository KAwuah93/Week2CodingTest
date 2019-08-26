package junglePackage;

public class Hawk extends Animal{
	
static int pride;
	
	Hawk(){
		super();
		pride++;
		this.name = "Hawk";
		this.cry = "Cahawkk";
		this.energyLvl = 7;
	}
	
	@Override
	public void makeNoise() {
		//default takes 8 energy for the tiger to make its noise
		super.makeNoise(2);
	}
	
	@Override
	public void sleep() {
		super.sleep(3);
	}
	
	void eat(String food) {
		if(food.equalsIgnoreCase("cactus")) {
			System.out.println(this.name + " doesn't enjoy this food... at all, in fact it looks a bit sick");
			this.energyLvl-=3;
		} else if(food.equalsIgnoreCase("rabbit")) {
			System.out.println(this.name + " Really enjoys the meal! bonus energy gained");
			this.energyLvl+=7;
		} else {
			super.eat();
		}
	}
	
	public int getPride() {
		return Tiger.pride;
	}

}
