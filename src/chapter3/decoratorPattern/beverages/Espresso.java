package chapter3.decoratorPattern.beverages;

import chapter3.decoratorPattern.Beverage;

/*
 * First we extend the Beverage class,
 * since this is a beverage.
 */
public class Espresso extends Beverage {
	public Espresso() {
		/*
		 * To take care of the description,
		 * we set this in the constructor for the class.
		 * Remember the description instance variable 
		 * is inherited from Beverage.
		 */
		description = "Espresso";
	}
	
	public double cost() {
		/*
		 * Finally, we need to compute the cost of an Espresso.
		 * Now that we don't need to worry about adding in condiments in this class,
		 * we just need to return the price of an Espresso: $1.99
		 */
		return 1.99;
	}
}
