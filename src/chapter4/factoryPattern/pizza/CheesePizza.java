package chapter4.factoryPattern.pizza;

import chapter4.factoryPattern.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * To make a pizza now, we need a factory to provide the ingredients.
	 * So each Pizza class gets a factory passed into its constructor, 
	 * and it's stored in an instance variable.
	 */
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		/*
		 * To make a clam, the prepare method collects the right ingredients from its local factory.
		 * If it's a New York factory,
		 * the clams will be fresh; if it's Chicago, they'll be frozen.
		 */
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
