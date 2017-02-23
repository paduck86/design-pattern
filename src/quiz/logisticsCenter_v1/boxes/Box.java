package quiz.logisticsCenter_v1.boxes;

import java.util.HashMap;

import quiz.logisticsCenter_v1.products.Item;

public class Box {
	private final int maxSize = 100;
	private int currentSize;
	private HashMap<Item, Integer> items; 
	
	public Box() {
		items = new HashMap<Item, Integer>();
	}
	
	public int getCurrentSize() {
		return currentSize;
	}
	public void setCurrentSize(int currentSize) {
		this.currentSize = currentSize;
	}
	public int getMaxSize() {
		return maxSize;
	}
	
	public HashMap<Item, Integer> getItems() {
		return items;
	}

	public void putItem(Item item, int count) {
		/*
		 * 오브젝트 간 비교	
		 */
		if (items.containsKey(item)) {
			items.put(item, items.get(item) + count);
		} else {
			items.put(item, count);
		}
		currentSize += item.getSize() * count;
	}
	
	public void printBox() {
		System.out.println("Box [currentSize=" + currentSize + ", items=" + items + "]");		
	}
	
}
