package chapter9.iteratorPattern.iteratee;

import java.util.Iterator;

import chapter9.iteratorPattern.iterators.DinerMenuIterator;

public class DinerMenu implements Menu{
	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem(
			"ä�������ڿ� BLT",
			"��� ���� (�Ĺ���)������, ����, �丶�並 ���� �޴�",
			true,
			2.99
		);
		
		addItem(
			"BLT",
			"��� ���� ������, ����, �丶�並 ���� �޴�",
			false,
			2.99
		);
		
		addItem(
			"������ ����",
			"���� �����带 ����� ������ ����",
			false,
			3.29
		);
		
		addItem(
			"�ֵ���",
			"���ũ����, ���� ���, ����, ġ� ������ �ֵ���",
			false,
			3.05
		);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("�˼��մϴ�, �޴��� �� á���ϴ�. �� �̻� �߰��� �� �����ϴ�.");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}
	
	/*
	 * getMenuItems() �޼ҵ�� �� �̻� �ʿ� �����ϴ�.
	 * ���� ������ �� �巯���� ������ �ֱ� ������ ���ִ� �� ����.
	 */
	/*public MenuItem[] getMenuItems() {
		return menuItems;
	}*/
	
	/*
	 * createIterator() �޼ҵ�, menuItems �迭�� ������
	 * DinerMenuIterator�� ������ ���� Ŭ���̾�Ʈ���� �����մϴ�.
	 * 
	 * Iterator �������̽��� �����մϴ�.
	 * Ŭ���̾�Ʈ������ menuItem�� ��� �����Ǵ����� ����
	 * DinerMenuIterator�� � ������ �����Ǿ� �ִ����� �� �ʿ䰡 ����.
	 * �׳� �ݺ��ڸ� �Ἥ �޴��� ����ִ� �׸�鿡 �ϳ��� ������ ���� ������ �˴ϴ�.
	 */
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
		
	}
	
}
