package chapter9.iteratorPattern.iterators;



import java.util.Iterator;

import chapter9.iteratorPattern.iteratee.MenuItem;

public class DinerMenuIterator implements Iterator{
	private MenuItem[] items;
	private int position = 0;
	
	/*
	 * 생성자에서는 반복작업을 수행할 메뉴항목에 대한 배열을 
	 * 인자로 받아들입니다.
	 */
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	/*
	 * next() 메소드에서는 배열의 다음 원소를 리턴하고 
	 * position 변수의 값을 1 증가시킵니다.
	 */
	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}
	@Override
	public boolean hasNext() {
		/*
		 * hasNext() 메소드에서는 배열에 있는 모든 원소를 돌았는지 확인한 다음 아직 
		 * 더 돌아야 할 원소가 있으면 true를 리턴합니다.
		 * 
		 * 객체마을 식당 주방장이 최대 개수가 정해진 배열을 만들었기 때문에,
		 * 배열 끝에 있는지를 확인하는 것 외에도 다음 항목이 null 인지도 확인해야 합니다.
		 * 그래야 원소가 더 남아있는지 확인할 수 있으니까요.
		 */
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}


}
