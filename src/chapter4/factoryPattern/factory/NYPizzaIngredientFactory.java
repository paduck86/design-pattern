package chapter4.factoryPattern.factory;

import chapter4.factoryPattern.ingredient.Cheese;
import chapter4.factoryPattern.ingredient.Clams;
import chapter4.factoryPattern.ingredient.Dough;
import chapter4.factoryPattern.ingredient.FreshClams;
import chapter4.factoryPattern.ingredient.Garlic;
import chapter4.factoryPattern.ingredient.MarinaraSauce;
import chapter4.factoryPattern.ingredient.Mushroom;
import chapter4.factoryPattern.ingredient.Onion;
import chapter4.factoryPattern.ingredient.Pepperoni;
import chapter4.factoryPattern.ingredient.RedPepper;
import chapter4.factoryPattern.ingredient.ReggianoCheese;
import chapter4.factoryPattern.ingredient.Sauce;
import chapter4.factoryPattern.ingredient.SlicedPepperoni;
import chapter4.factoryPattern.ingredient.ThinCrustDough;
import chapter4.factoryPattern.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		/*
		 * For veggies, we return an array of Veggies. 
		 */
		Veggies[] veggies = { 
				new Garlic(), 
				new Onion(), 
				new Mushroom(), 
				new RedPepper() 
		};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
