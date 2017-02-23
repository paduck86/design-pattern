package quiz.logisticsCenter_v1.creator;

import java.util.ArrayList;
import java.util.List;

import quiz.logisticsCenter_v1.products.Box;
import quiz.logisticsCenter_v1.products.Item;

public class LogisticsCenter {
	private List<Box> boxList;
	private LogisticsFactory logisticsFactory;
	
	public LogisticsCenter() {
		boxList = new ArrayList<Box>();
		logisticsFactory = new LogisticsFactory();
	}
	
	public void packing(String itemName, int count) {
		
		Item item;
		
		item = logisticsFactory.createItem(itemName);
		
		putItem(item, count);
		
		//printBoxes();
		
	}

	private void putItem(Item item, int count) {
		Box box = null;
		if (boxList.size() == 0) {
			box = new Box();
			box.putItem(item, count);
			boxList.add(box);
		} else if (boxList.size() > 0) {
			box = boxList.get(boxList.size() - 1);
			if (box.getCurrentSize() + (item.getSize() * count) > box.getMaxSize()) {
				box = new Box();
				box.putItem(item, count);
				boxList.add(box);
			} else {
				box.putItem(item, count);
			}
		}
		
		
		
		
	}

	public void printBoxes() {
		for (int i = 0; i < boxList.size(); i++) {
			boxList.get(i).printBox();
		}
		
	}
	
}
