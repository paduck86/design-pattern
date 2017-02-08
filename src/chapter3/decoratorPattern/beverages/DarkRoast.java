package chapter3.decoratorPattern.beverages;

import chapter3.decoratorPattern.Beverage;

public class DarkRoast extends Beverage{
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	public double cost() {
		return .99;
	}
}
