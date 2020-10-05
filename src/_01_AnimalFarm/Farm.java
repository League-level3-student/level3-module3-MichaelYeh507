package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm{
	public static void main(String[] args) {
		ArrayList <Animal> farm = new ArrayList<Animal>();
		Dog doggo1 = new Dog();
		Dog doggo2 = new Dog();
		Pig piggy1 = new Pig();
		Pig piggy2 = new Pig();
		Cat kitty = new Cat();
		Pony pony = new Pony();
		
		farm.add(doggo1);
		farm.add(doggo2);
		farm.add(piggy1);
		farm.add(piggy2);
		farm.add(kitty);
		farm.add(pony);
		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).eat();
		}
	}
}
