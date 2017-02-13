package chapter4.factoryPattern.factory;

import chapter4.factoryPattern.pizza.CheesePizza;
import chapter4.factoryPattern.pizza.ClamPizza;
import chapter4.factoryPattern.pizza.PepperoniPizza;
import chapter4.factoryPattern.pizza.Pizza;
import chapter4.factoryPattern.pizza.VeggiePizza;

/*
 * Here's our new class, the SimplePizzaFactory.
 * It has one job in life: creating pizzas for its clients.
 */
public class SimplePizzaFactory {
	/*
	 * First we define a createPizza() method in the factory.
	 * This is the method all clients will use to 
	 * instantiate new objects.
	 */
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		/*
		 * Here's the code we plucked out of the orderPizza() method.
		 * 
		 * This code is still parameterized by the type of the pizza,
		 * just like our original orderPizza() method was
		 * 
		 */
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
