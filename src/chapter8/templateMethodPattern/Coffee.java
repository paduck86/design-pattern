package chapter8.templateMethodPattern;

public class Coffee extends CaffeineBeverage{
	/*
	 * Tea needs to define brew() and addCondiments() 
	 *  - the two abstract methods from Beverage.
	 */
	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");		
	}
	/*public void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}
	
	public void boilWater() {
		System.out.println("Boiling water");
		
	}

	public void brewCoffeeGrinds() {
		System.out.println("Dripping Coffee through filter");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	public void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");
	}
*/

	

	
}
