package chapter1.strategyPattern;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("���� �� ���ƿ�");
		
	}

}
