package chapter7.adapterPattern.adaptee;

public class WildTurkey implements Turkey {
	
	/*
	 * Turkey 구상 클래스, Duck 구상 클래스에서와 마찬가지로
	 * 무슨 행동을 하는지 출력하는 정도로 메소드 구현을 간단하게 처리했습니다.
	 */
	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
