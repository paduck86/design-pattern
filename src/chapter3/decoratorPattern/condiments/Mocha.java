package chapter3.decoratorPattern.condiments;

import chapter3.decoratorPattern.Beverage;
import chapter3.decoratorPattern.CondimentDecorator;

/*
 * Mocha is a decorator, so we extend CondimentDecorator.
 * Remember, CondimentDecorator extends Beverage.
 */
public class Mocha extends CondimentDecorator{
	/*
	 * We're going to instantiate Mocha with a reference to a Beverage using:
	 * (1) An instance variable to hold the beverage we are wrapping.
	 */
	Beverage beverage;
	
	/*
	 * (2) A way to set this instance variable to the object we are wrapping.
	 * 	   Here, we're going to pass the beverage we're wrappping to the 
	 *     decorator's constructor.	
	 */
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		/*
		 * We want our description to not only include the beverage 
		 * - say "Dark Roast" - but also to include each item decorating the beverage,
		 * for instance, "Dark Roast, Mocha". 
		 * So we first delegate to the object we are decorating to get its description,
		 * then append ", Mocha" to that description
		 */
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost() {
		return .20 + beverage.cost();
	}
}
