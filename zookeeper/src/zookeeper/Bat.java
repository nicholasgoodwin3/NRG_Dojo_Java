package zookeeper;

public class Bat extends Mammal {

    public Bat(){
        super(500);
    }

    void fly(){
        System.out.println("SWOOSH! The bat takes flight but loses 50 energy!");
        energyLevel -= 50;
        displayEnergy();
    }

    void eatHumans(){
        System.out.println("The bat enjoys a human snack, it gains 25 energy from that delicious morsel!");
        energyLevel += 25;
        displayEnergy();
    }

    void attackTown(){
        System.out.println("the bat terrorizes the town, but loses 100 energy!");
        energyLevel -= 100;
        displayEnergy();
    }
}