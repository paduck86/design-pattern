package chapter4.factoryPattern.pizza;

import chapter4.factoryPattern.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza() {
		// TODO Auto-generated constructor stub
	}
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
