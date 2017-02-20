package chapter8.templateMethodPattern.withHook;

public abstract class CaffeineBeverageWithHook {
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		/*
		 * We've added a little conditional statement 
		 * that bases its success on a concrete method,
		 * customerWatsCondiments().
		 * If the customer wants a condiments, 
		 * only then do we call addCondiments().
		 */
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	public void boilWater() {
		System.out.println("Boiling water");
		
	}
	public abstract void brew();
	public abstract void addCondiments();
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	/*
	 * Here we've defined a method with a (mostly) empty default implementation.
	 * This method just returns true and does nothing else.
	 * 
	 * This is a HOOK because the subclass can override this method,
	 * but doesn't have to.
	 */
	public boolean customerWantsCondiments() {
		return true;
	}

}
