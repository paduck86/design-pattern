package chapter3.decoratorPattern.inputStreamFilter;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/*
 * First, extend the FilterInputStream, the abstract decorator for all InputStreams.
 */
public class LowerCaseInputStream extends FilterInputStream{

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	/*
	 * Now we need to implement two read methods. 
	 * They take a byte (or an array of bytes)
	 * and convert each byte (that represents a character) 
	 * to lowercase if it's an uppercase character.
	 */
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}

}
