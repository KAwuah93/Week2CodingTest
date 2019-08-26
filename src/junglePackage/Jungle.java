package junglePackage;

import java.util.ArrayList;

public class Jungle {
	public static void main(String[] args) {
		
		//Create the bois
		Monkey monkey = new Monkey();
		Tiger tiger = new Tiger();
		Snake snake = new Snake();
		Hawk hawk = new Hawk();
		//Default constructor to create another creature
		Animal chicken = new Animal("Chicken");
		//Create Jungle
		Jungle terra = new Jungle();
		
		//add animal to the jungle
		terra.addAnimal(new Tiger());
		terra.addAnimal(new Tiger());
		terra.addAnimal(new Tiger());
		terra.addAnimal(new Tiger());
		terra.addAnimal(new Tiger());
		terra.addAnimal(tiger);
		terra.addAnimal(monkey);
		terra.addAnimal(snake);
		terra.addAnimal(hawk);
		//Sound off for the Jungle
		terra.soundOff();
		//Showing the individual Animal pride ize
		int prideCount = terra.getAnimal(0).getPride();
		
		//Lets feed the monkey and then have him put on a show
		monkey.eat("Banana");
		monkey.eat();
		monkey.play();
		
		//example printout using the pride number that we pulled.
		System.out.println("The pride size of the Tigers is: "+ prideCount);
	}
	//setting this up
	ArrayList<Animal> population;
	
	Jungle(){
		this.population = new ArrayList<>();
	}
	
	void soundOff() {
		for(Animal animal : population) {
			animal.makeNoise();
			animal.condition();
		}
	}
	
	void addAnimal(Animal newbie) {
		population.add(newbie);
		}
	
	public Animal getAnimal(int i) {
		return population.get(i);
	}
	
	public int getPopulation(int i){
		return population.size();
	}

}
