package chapter4.factoryPattern.pizza;

import chapter4.factoryPattern.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza() {
		// TODO Auto-generated constructor stub
	}
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
