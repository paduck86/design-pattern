package chapter7.adapterPattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdaptor implements Iterator {

	Enumeration enumeration;
	
	public EnumerationIteratorAdaptor(Enumeration enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
