package quiz.logisticsCenter_v1.products;

public abstract class Item {
	protected int size;

	public int getSize() {
		return size;
	}

	public void box(int count) {
		System.out.println("Place item in LogisticsCenter box");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
		return result;	
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Item) {
			Item item = (Item)obj;
			return this.size == item.getSize();
		} else {
			return false;
		}
	}
	
}
