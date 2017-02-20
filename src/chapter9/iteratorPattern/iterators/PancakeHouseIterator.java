package chapter9.iteratorPattern.iterators;

import java.util.ArrayList;
import java.util.List;

import chapter9.iteratorPattern.iteratee.MenuItem;

public class PancakeHouseIterator implements Iterator {
	private List items;
	private int position = 0;
	
	public PancakeHouseIterator(List items) {
		this.items = items;
	}
	
	@Override
	public Object next() {
		MenuItem menuItem = (MenuItem)items.get(position);
		position++;
		return menuItem;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}


}
