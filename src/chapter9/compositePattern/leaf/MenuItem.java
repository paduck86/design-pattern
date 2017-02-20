package chapter9.compositePattern.leaf;

import java.util.Iterator;

import chapter9.compositePattern.component.MenuComponent;
import chapter9.compositePattern.iterator.NullIterator;

public class MenuItem extends MenuComponent{
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;

	/*
	 * The constructor just takes the name, description, etc.
	 * and keeps a reference to them all.
	 * This is pretty much like our old menu item implementation.
	 */
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	/*
	 * Here's our getter methods - just like our previous implementation.
	 */
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}
	
	/*
	 * This is different from the previous implementation.
	 * Here we're overriding the print() method in the MenuComponent class.
	 * For MenuItem this method prints the complete menu entry: 
	 * 	name, description, price and whether or not it's veggie.
	 */
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.print(", " + getPrice());
		System.out.println("    -- " + getDescription());
	}

	/*
	 * Now for the MenuItem...
	 * Whoa! Waht's this NullIterator?
	 * You'll see in two pages.
	 */
	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}
	
}
