package chapter3.decoratorPattern;

public abstract class CondimentDecorator extends Beverage{
	/*
	 * We're going to require that the condiment decorators
	 * all reimplement the getDescription() method. 
	 * Again, we'll see why in a sec ...
	 */
	public abstract String getDescription();
}
