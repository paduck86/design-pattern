package chapter1.strategyPattern;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("<< Á¶¿ë~ >>");
		
	}

}
