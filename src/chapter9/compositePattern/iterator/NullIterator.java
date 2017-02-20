package chapter9.compositePattern.iterator;

import java.util.Iterator;
/*
 * This is the laziest Iterator you've ever seen,
 * at every step of the way it punts.
 */
public class NullIterator implements Iterator{

	/*
	 * When the next() is called, we return null.
	 */
	@Override
	public Object next() {
		return null;
	}

	/*
	 * Most importantly when hasNext() is called we always return false.
	 */
	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
