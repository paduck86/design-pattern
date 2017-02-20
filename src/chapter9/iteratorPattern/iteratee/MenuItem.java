package chapter9.iteratorPattern.iteratee;

public class MenuItem {
	public String name;
	public String description;
	public boolean vegetarian;
	public double price;
	
	public MenuItem() {
		// TODO Auto-generated constructor stub
	}
	
	public MenuItem(
				String name,
				String description,
				boolean vegetarian,
				double price
			) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}
	
	
}
