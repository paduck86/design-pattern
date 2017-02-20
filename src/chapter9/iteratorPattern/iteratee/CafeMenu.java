package chapter9.iteratorPattern.iteratee;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
	/*
	 * The Cafe is storing their menu items in a Hashtable.
	 * Does that support Iterator? We'll see shortly...
	 */
	private Hashtable menuItems = new Hashtable();
	
	public CafeMenu() {
		addItem(
			"Veggie Burger and Air Fires",
			"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
			true, 
			3.99
		);
		
		addItem(
			"Soup of the day",
			"A cup of the soup of the day, with a side salad",
			false, 
			3.69
		);
		
		addItem(
			"Burrito",
			"A large burrito, with whole pinto beans, sals, guacamole",
			true, 
			4.29
		);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	
	@Override
	public Iterator createIterator() {
		/*
		 * Here's where we implement the createIterator() method.
		 * Notice that we're not getting an Iterator 
		 * for the whole Hashtable, just for the values.
		 */
		return menuItems.values().iterator();
	}

}
