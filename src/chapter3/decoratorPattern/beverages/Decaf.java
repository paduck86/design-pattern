package chapter3.decoratorPattern.beverages;

import chapter3.decoratorPattern.Beverage;

public class Decaf extends Beverage{
	public Decaf() {
		description = "Decaf Coffee";
	}
	
	public double cost() {
		return 1.05;
	}
}
