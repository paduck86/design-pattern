package chapter8.templateMethodPattern.withHook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

	@Override
	public void brew() {
		System.out.println("Dripping Coffee throug filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	/*
	 * Here's where you override the hook and provide your own functionality.
	 * 
	 * Get the user's input on the condiment decision and return true or false.
	 * depending on the input.
	 */
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		/*
		 * This code asks the user if he'd like milk and sugar 
		 * and gets his input from the command line.
		 */
		String answer = null;
		
		System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
