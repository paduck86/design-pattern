package chapter9.compositePattern.iterator;

import java.util.Iterator;
import java.util.Stack;

import chapter9.compositePattern.component.MenuComponent;
import chapter9.compositePattern.composite.Menu;

/*
 * Lke all iterators, we're implementing the java.util.Iterator interface.
 */
public class CompositeIterator implements Iterator {
	private Stack stack = new Stack();
	
	/*
	 * The iterator of the top level composite we're going to iterate over
	 * is passed in. We throw that in a stack data structure.
	 */
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	@Override
	public Object next() {
		/*
		 * Okay, when the client wants to get the next element 
		 * we first make sure there is one by calling hasNext()...
		 */
		if(hasNext()) {
			/*
			 * If there is a next element, we get the current iterator off the stack
			 * and get its next element.
			 */
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu) {
				/*
				 * If that element is a menu, we have another composite 
				 * that needs to be included in the iteration,
				 * so we throw it on the stack.
				 * In either case, we return the component.
				 */
				stack.push(component.createIterator());
			} 
			return component;
		} else {
			return null;
		}
	}
	
	@Override
	public boolean hasNext() {
		/*
		 * To see if there is a next element, 
		 * we check to see if the stack is empty; if so, there isn't.
		 * Otherwise, we get the iterator off the top of the stack and see
		 * if it has a next element. 
		 * If it doesn't, we pop it off the stack
		 * and call hasNext() recursively. 
		 */
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
