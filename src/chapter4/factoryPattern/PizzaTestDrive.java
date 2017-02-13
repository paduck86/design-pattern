package chapter4.factoryPattern;

import chapter4.factoryPattern.pizza.Pizza;

public class PizzaTestDrive {
	public static void main(String[] args) {
		/*
		 * First we create two different stores.
		 */
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		/*
		 * Then use one store to make Ethan's order.
		 */
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		/*
		 * And the other for Joel's
		 */
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
