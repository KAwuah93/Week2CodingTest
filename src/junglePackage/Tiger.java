package junglePackage;

public class Tiger extends Animal{
	static int pride;
	
	Tiger(){
		super();
		Tiger.pride++;
		this.name = "Tiger";
		this.cry = "RAWWWR";
		this.energyLvl = 10;
	}
	
	@Override
	public void makeNoise() {
		//default takes 8 energy for the tiger to make its noise
		super.makeNoise(8);
	}
	
	@Override
	public void sleep() {
		super.sleep(5);
	}
	
	public void eat(String food) {
		if(food.equalsIgnoreCase("grain")) {
			System.out.println(this.name + " doesn't enjoy this food... at all, in fact it looks a bit sick");
			this.energyLvl-=3;
		} else if(food.equalsIgnoreCase("meat")) {
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
