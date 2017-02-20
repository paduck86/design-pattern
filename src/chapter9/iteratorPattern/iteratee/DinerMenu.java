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
			"채식주의자용 BLT",
			"통밀 위에 (식물성)베이컨, 상추, 토마토를 얹은 메뉴",
			true,
			2.99
		);
		
		addItem(
			"BLT",
			"통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴",
			false,
			2.99
		);
		
		addItem(
			"오늘의 스프",
			"감자 샐러드를 곁들인 오늘의 스프",
			false,
			3.29
		);
		
		addItem(
			"핫도그",
			"사워크라우드, 갖은 양념, 양파, 치즈가 곁들어진 핫도그",
			false,
			3.05
		);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}
	
	/*
	 * getMenuItems() 메소드는 더 이상 필요 없습니다.
	 * 내부 구조를 다 드러내는 단점이 있기 때문에 없애는 게 낫죠.
	 */
	/*public MenuItem[] getMenuItems() {
		return menuItems;
	}*/
	
	/*
	 * createIterator() 메소드, menuItems 배열을 가지고
	 * DinerMenuIterator를 생성한 다음 클라이언트에게 리턴합니다.
	 * 
	 * Iterator 인터페이스를 리턴합니다.
	 * 클라이언트에서는 menuItem이 어떻게 관리되는지는 물론
	 * DinerMenuIterator가 어떤 식으로 구현되어 있는지도 알 필요가 없죠.
	 * 그냥 반복자를 써서 메뉴에 들어있는 항목들에 하나씩 접근할 수만 있으면 됩니다.
	 */
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
		
	}
	
}
