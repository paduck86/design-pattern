package chapter1.strategyPattern;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Ва");
		
	}

}
