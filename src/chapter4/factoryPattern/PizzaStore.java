package chapter4.factoryPattern;

import chapter4.factoryPattern.pizza.Pizza;

public abstract class PizzaStore {
	// Now we give PizzaStore a reference to a SimplePizzaFactory
	//SimplePizzaFactory factory;
	
	/*
	 * PizzaStore gets the factory passed to it in the constructor.
	 */
	//public PizzaStore(SimplePizzaFactory factory) {
	//	this.factory = factory;
	//}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		/*
		 * And the orderPizza() method uses the factory 
		 * to create its pizzas by simply passing on the type of the order.
		 */
		//pizza = factory.createPizza(type);
		
		/*
		 * Now createPizza is back to being a call to a method
		 * in the PizzaStore rather than on a factory object.
		 */
		pizza = createPizza(type);
		
		/*
		 * Notice that we've replaced the new operator 
		 * with a reate method on the factory object. 
		 * No more concrete instantiations here!
		 */
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	/*
	 * Now we've moved our factory object to this method.
	 * Our "factory method" is now abstract in PizzaStore.
	 */
	public abstract Pizza createPizza(String type);
}
