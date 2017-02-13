package chapter4.factoryPattern.pizza;

public class NYStyleCheesePizza extends Pizza {
	/*
	 * The NY Pizza has its own marinara style sauce and thin crust
	 */
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		//dough = "Thin Crust Dough";
		//sauce = "Marinara Sauce";
		
		/*
		 * And one topping, reggiano cheese!
		 */
		//toppings.add("Grated Reggiano Cheese");
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
