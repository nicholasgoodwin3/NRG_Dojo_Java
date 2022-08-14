package zookeeper1;

public class Gorilla extends mammal {
	private static int energyLevel;
	public Gorilla(int i) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("The gorilla is dissatisfied, it throws a stick at you!");
		energyLevel -= 5;
	}
	public void eatBanana() {
		System.out.println("The gorilla eats a nutritious banana so it can throw more things at you!");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("The gorilla climbs up a tree to throw more sticks at you!");
		energyLevel -= 10;
	}
}
