package chapter4.factoryPattern.factory;

import chapter4.factoryPattern.ingredient.Cheese;
import chapter4.factoryPattern.ingredient.Clams;
import chapter4.factoryPattern.ingredient.Dough;
import chapter4.factoryPattern.ingredient.FrozenClams;
import chapter4.factoryPattern.ingredient.Garlic;
import chapter4.factoryPattern.ingredient.GreenPepper;
import chapter4.factoryPattern.ingredient.MozzarellaCheese;
import chapter4.factoryPattern.ingredient.Mushroom;
import chapter4.factoryPattern.ingredient.Onion;
import chapter4.factoryPattern.ingredient.Pepperoni;
import chapter4.factoryPattern.ingredient.PlumTomatoSauce;
import chapter4.factoryPattern.ingredient.RedPepper;
import chapter4.factoryPattern.ingredient.Sauce;
import chapter4.factoryPattern.ingredient.ThickCrustDough;
import chapter4.factoryPattern.ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
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
		return new GreenPepper();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
