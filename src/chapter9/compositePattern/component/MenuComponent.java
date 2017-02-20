package chapter9.compositePattern.component;

import java.util.Iterator;

/*
 * MenuComponent provides default implementations for every method.
 */
public abstract class MenuComponent {
	/*
	 * We've grouped together the "composite" methods 
	 * - that is, methods to add, remove and get MenuComponents.
	 */
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	/*
	 * Here are the "operation" methods;
	 * these are used by the MenuItems.
	 * It turns out we can also use a couple of them in Menu too,
	 * as you'll see in a couple of pages 
	 * when we show the Menu code.
	 * 
	 * print() is an "operation" method 
	 * that both our Menus and MenuItems will implement,
	 * but we provide a default operation here.
	 */
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	/*
	 * We've added a createIterator() method to the MenuComponent.
	 * This means that each Menu and MenuItem will need to implement this method.
	 * It also means that calling createIterator() on a composite 
	 * should apply to all children of the composite.
	 */
	public abstract Iterator createIterator();

	
	
}
