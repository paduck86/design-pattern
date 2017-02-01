package chapter1.strategyPattern;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("»à");
		
	}

}
