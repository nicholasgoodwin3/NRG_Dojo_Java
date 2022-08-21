package com.summer.FruityLoops.Models;

public class FruitList {
	// MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    public FruitList(String name, double price) {
        this.name = name;
        this.price = price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	} //auto generated getters and setters
}
