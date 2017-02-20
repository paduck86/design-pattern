package chapter8.templateMethodPattern;

/*
 * CaffeineBeverage is abstract, just like in the class design.
 */
public abstract class CaffeineBeverage {
	/*
	 * Now, the same prepareRecipe() method will be used to make both Tea and Coffee.
	 * prepareRecipe() is declared final because we don't want our subclasses 
	 * to be able to override this method and change the recipe!
	 * We've generalized steps 2 and 4 to brew() the beverage and addCondiments(). 
	 */
	
	/*
	 * prepareRecipe() is our template method. Why?
	 * Because :
	 * 1) It's a method, after all.
	 * 2) It serves as a tempalte for an algorithm, in this case,
	 * 	  and algorithm for making caffeinated beverages.
	 * 
	 * In the template, each step of the algorithm is represented by a method.
	 * Some methods are handled by this class, and some methods are handled by the subclass.
	 * 
	 * The methods that need to be supplied by a subclass are declared abstract.
	 * 
	 * -> The Template Method defines the steps of an algorithm 
	 * 	  and allows subclasses to provide the implementation for one or more steps. 
	 * 
	 */
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	/*
	 * Because Coffee and Tea handle these methods in different ways,
	 * they're going to have to be declared as abstract.
	 * Let the subclasses worry about that stuff!
	 */
	public abstract void brew();
	public abstract void addCondiments();
	
	/*
	 * Remember, we moved these into the CaffeineBeverage class (back in our class diagram).
	 */
	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
