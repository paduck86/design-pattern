package chapter1.strategyPattern;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("���� �־��!!");
	}
}
