package chapter4.factoryPattern.pizza;

import chapter4.factoryPattern.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza() {
		// TODO Auto-generated constructor stub
	}
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
