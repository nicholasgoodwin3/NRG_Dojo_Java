package zookeeper1;

public class mammal {
	int energyLevel = 100;
	public int displayEnergy() {
		System.out.println("Current level of energy: %s\n" + energyLevel);
		return this.energyLevel;
	}
	public mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
