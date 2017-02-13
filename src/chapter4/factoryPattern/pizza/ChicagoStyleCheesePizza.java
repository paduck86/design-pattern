package chapter4.factoryPattern.pizza;

public class ChicagoStyleCheesePizza extends Pizza {
	/*
	 * The Chicago Pizza uses plum tomatoes as a sauce 
	 * aling with extra thick crust.
	 */
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		//dough = "Extra Thich Crust Dough";
		//sauce = "Plum Tomato Sauce";
		
		/*
		 * The Chicago style deep dish pizza has lots of mozzarella cheese!
		 */
		//toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	public void cut() {
		/*
		 * The Chicago style pizza also overrides the cut() methods 
		 * so that the pieces are cut into squares.
		 */
		System.out.println("Cutting the pizzza into square slices");
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
