package chapter4.factoryPattern.pizza;

import chapter4.factoryPattern.ingredient.Cheese;
import chapter4.factoryPattern.ingredient.Clams;
import chapter4.factoryPattern.ingredient.Dough;
import chapter4.factoryPattern.ingredient.Pepperoni;
import chapter4.factoryPattern.ingredient.Sauce;
import chapter4.factoryPattern.ingredient.Veggies;

/*
 * We'll start with an abstract Pizza class 
 * and all the concrete pizzas will derive from this.
 */
public abstract class Pizza {
	/*
	 * Each Pizza has a name, a type of dough, 
	 * a type of sauce, and a set of toppings.
	 */
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	//List toppings = new ArrayList();
	
	/*public void prepare() {
		
		 * The abstract class provides som basic defaults for baking, cutting and boxing.
		 * 
		 * Preparation follows a number of steps in a particular sequence.
		 
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("\t" + toppings.get(i));
		}
	}*/
	public abstract void prepare();
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
