package chapter3.decoratorPattern.beverages;

import chapter3.decoratorPattern.Beverage;

public class HouseBlend extends Beverage{
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	public double cost() {
		return .89;
	}
}
