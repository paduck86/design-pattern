package chapter9.iteratorPattern.iterators;



import java.util.Iterator;

import chapter9.iteratorPattern.iteratee.MenuItem;

public class DinerMenuIterator implements Iterator{
	private MenuItem[] items;
	private int position = 0;
	
	/*
	 * �����ڿ����� �ݺ��۾��� ������ �޴��׸� ���� �迭�� 
	 * ���ڷ� �޾Ƶ��Դϴ�.
	 */
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	/*
	 * next() �޼ҵ忡���� �迭�� ���� ���Ҹ� �����ϰ� 
	 * position ������ ���� 1 ������ŵ�ϴ�.
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
		 * hasNext() �޼ҵ忡���� �迭�� �ִ� ��� ���Ҹ� ���Ҵ��� Ȯ���� ���� ���� 
		 * �� ���ƾ� �� ���Ұ� ������ true�� �����մϴ�.
		 * 
		 * ��ü���� �Ĵ� �ֹ����� �ִ� ������ ������ �迭�� ������� ������,
		 * �迭 ���� �ִ����� Ȯ���ϴ� �� �ܿ��� ���� �׸��� null ������ Ȯ���ؾ� �մϴ�.
		 * �׷��� ���Ұ� �� �����ִ��� Ȯ���� �� �����ϱ��.
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
