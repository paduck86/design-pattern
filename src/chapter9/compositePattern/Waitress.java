package chapter9.compositePattern;

import java.util.Iterator;

import chapter9.compositePattern.component.MenuComponent;

public class Waitress {
	private MenuComponent allMenus;
	
	/*
	 * Yup! The Waitress code really is this simple.
	 * Now we just hand her the top level menu component,
	 * the on that contains all the other menus.
	 * We've called that allMenus
	 */
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	/*
	 * All she has to do to print the entire menu hierarchy 
	 * - all the menus, and all the menu items - 
	 * is call print() on the top level menu.
	 * 
	 * We're gonna have one happy Waitress.
	 */
	public void printMenu() {
		allMenus.print();
	}
	
	/*
	 * The printVegetarianMenu() method takes the allMenu's composite
	 * and gets its iterator. That will be our CompositeIterator.
	 */
	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			/*
			 * Iterate through every element of the composite.
			 */
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			try {
				/*
				 * Call each element's isVegetarian() method and 
				 * if true, we call its print() method.
				 */
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
				/*
				 * print() is only called on MenuItems,
				 * never Composites. Can you see why?
				 * 
				 * We implemented isVegetarian() on the menus to always throw an exception.
				 * If that happens we catch the exception,
				 * but continue with our iteration.
				 */
			} catch (UnsupportedOperationException e) {
				
			}
		}
	}
}
