package chapter4.factoryPattern;

import chapter4.factoryPattern.factory.ChicagoPizzaIngredientFactory;
import chapter4.factoryPattern.factory.PizzaIngredientFactory;
import chapter4.factoryPattern.pizza.CheesePizza;
import chapter4.factoryPattern.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
			//pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
			//pizza = new ChicagoStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
			//pizza = new ChicagoStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
			//pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;
	}

}
