package chapter8.templateMethodPattern.sorting;

/*
 * Remember, we need to implement the Comparable interface 
 * since we aren't really subclassing.
 */
public class Duck implements Comparable {
	private String name;
	private int weight;
	
	/*
	 * Our Ducks have a name and a weight.
	 */
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	/*
	 * We're keepin' it simple; all Ducks do is print their name and weight!
	 */
	@Override
	public String toString() {
		return name + " weights " + weight;
	}
	
	/*
	 * Okay, here's what sort needs ...
	 * 
	 * compareTo() takes another Duck to compare THIS Duck to.
	 */
	@Override
	public int compareTo(Object object) {
		Duck otherDuck = (Duck)object;
		
		/*
		 * Here's where we specify how Ducks compare.
		 * If THIS Duck weighs less than otherDuck,
		 * than we return -1;
		 * if they are equal, we return 0;
		 * and if THIS Duck weighs more, we return 1.
		 */
		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else {	// this.weight > otherDuck.weight
			return 1;
		}
		
	}

}
