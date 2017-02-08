package chapter3.decoratorPattern.inputStreamFilter;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException{
		int c;
		try {
			/*
			 * Set up the FileInputStream and decorate it, 
			 * first with a BufferedInputStream 
			 * and then our brand new LowerCaseInputStream filter.
			 */
			InputStream in = 
					new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream("C:\\test.txt")));
			/*
			 * Just use the stream to read characters 
			 * until the end of file and print as we go. 
			 */
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
