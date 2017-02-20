package chapter9.iteratorPattern.iteratee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{
	public List menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		
		addItem(
			"K&B ������ũ ��Ʈ",
			"��ũ����� ���׿� �佺Ʈ�� ��鿩�� ������ũ",
			true,
			2.99
		);
		
		addItem(
			"���ַ� ������ũ ��Ʈ",
			"�ް� �Ķ��̿� �ҽ����� ��鿩�� ������ũ",
			false,
			2.99
		);
		
		addItem(
			"��纣�� ������ũ ��Ʈ",
			"�ż��� ��纣���� ��纣�� �÷����� ���� ������ũ",
			true,
			3.49
		);
		
		addItem(
			"����",
			"����, ���⿡ ���� ��纣���� ���⸦ ���� �� �����ϴ�.",
			true,
			3.59
		);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	/*public ArrayList getMenuItems() {
		return menuItems;
	}*/
	@Override
 	public Iterator createIterator() {
 		return menuItems.iterator();
		//return new PancakeHouseIterator(menuItems);
	}
}
