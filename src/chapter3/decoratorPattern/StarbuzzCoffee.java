package chapter3.decoratorPattern;

import chapter3.decoratorPattern.beverages.DarkRoast;
import chapter3.decoratorPattern.beverages.Espresso;
import chapter3.decoratorPattern.beverages.HouseBlend;
import chapter3.decoratorPattern.condiments.Mocha;
import chapter3.decoratorPattern.condiments.Soy;
import chapter3.decoratorPattern.condiments.Whip;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		// Order up an espresso, no condiments and print its description and cost.
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		// Make a DarkRoast object
		Beverage beverage2 = new DarkRoast();
		// Wrap it with a Mocha
		beverage2 = new Mocha(beverage2);
		// Wrap it in a second Mocha
		beverage2 = new Mocha(beverage2);
		// Wrap it in a Whip
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		// Finally, give us a HouseBlend with Soy, Mocha, adn Whip.
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
