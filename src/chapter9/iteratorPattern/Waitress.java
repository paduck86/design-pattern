package chapter9.iteratorPattern;

import java.util.Iterator;
import java.util.List;

import chapter9.iteratorPattern.iteratee.Menu;
import chapter9.iteratorPattern.iteratee.MenuItem;

public class Waitress {
	private List menus;
	/*private Menu pancakeHouseMenu;
	private Menu dinerMenu;*/
	
	/*
	 * The Cafe menu is passed into the waitress in the constructor
	 * with the other menus, and we stash it in an instance variable
	 */
	//private Menu cafeMenu;
	
	public Waitress(List menus) {
		this.menus = menus;
	}
	
	/*public Waitress(
			Menu pancakeHouseMenu, 
			Menu dinerMenu,
			Menu cafeMenu
			) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}*/
	
	public void printMenu() {
		Iterator menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			printMenu(menu.createIterator());
		}
		/*Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		
		 * We're using the Cafe's menu for our dinner menu.
		 * All we have to do to print it is create the iterator,
		 * and pass it to printMene(). That's it!
		 
		Iterator cafeIterator = cafeMenu.createIterator();
		System.out.println("메뉴\n---\n아침 메뉴");
		printMenu(pancakeIterator);
		System.out.println("\n점심 메뉴");
		printMenu(dinerIterator);
		System.out.println("\n저녁 메뉴");
		printMenu(cafeIterator);*/
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
