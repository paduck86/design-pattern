package chapter4.factoryPattern.factory;

import chapter4.factoryPattern.ingredient.Cheese;
import chapter4.factoryPattern.ingredient.Clams;
import chapter4.factoryPattern.ingredient.Dough;
import chapter4.factoryPattern.ingredient.Pepperoni;
import chapter4.factoryPattern.ingredient.Sauce;
import chapter4.factoryPattern.ingredient.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
