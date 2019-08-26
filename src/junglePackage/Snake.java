package junglePackage;

public class Snake extends Animal{
static int pride;
	
	Snake(){
		super();
		pride++;
		this.name = "Snake";
		this.cry = "Hsssss";
		this.energyLvl = 4;
	}
	
	@Override
	public void makeNoise() {
		super.makeNoise(1);
	}
	
	@Override
	public void sleep() {
		super.sleep(3);
	}
	
	void eat(String food) {
		if(food.equalsIgnoreCase("vegatables")) {
			System.out.println(this.name + " doesn't enjoy this food... at all, in fact it looks a bit sick");
			this.energyLvl-=1;
		} else if(food.equalsIgnoreCase("mouse")) {
			System.out.println(this.name + " Really enjoys the meal! bonus energy gained");
			this.energyLvl+=4;
		} else {
			super.eat();
		}
	}
	
	public int getPride() {
		return Snake.pride;
	}

}
