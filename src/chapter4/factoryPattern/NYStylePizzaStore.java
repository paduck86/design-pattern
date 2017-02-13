package chapter4.factoryPattern;

import chapter4.factoryPattern.factory.NYPizzaIngredientFactory;
import chapter4.factoryPattern.factory.PizzaIngredientFactory;
import chapter4.factoryPattern.pizza.CheesePizza;
import chapter4.factoryPattern.pizza.ClamPizza;
import chapter4.factoryPattern.pizza.PepperoniPizza;
import chapter4.factoryPattern.pizza.Pizza;
import chapter4.factoryPattern.pizza.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		/*
		 * The NY Store is composed with a NY pizza ingredient factory.
		 * This will be used to produce the ingredients for all NY style pizzas.
		 */
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory(); 
		if (type.equals("cheese")) {
			//pizza = new NYStyleCheesePizza();
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("pepperoni")) {
			//pizza = new NYStylePepperoniPizza();
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		} else if (type.equals("clam")) {
			//pizza = new NYStyleClamPizza();
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
			//pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}

}
