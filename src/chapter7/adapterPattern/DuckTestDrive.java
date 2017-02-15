package chapter7.adapterPattern;

import chapter7.adapterPattern.adaptee.Turkey;
import chapter7.adapterPattern.adaptee.WildTurkey;
import chapter7.adapterPattern.adapter.TurkeyAdapter;
import chapter7.adapterPattern.target.Duck;
import chapter7.adapterPattern.target.MallardDuck;

public class DuckTestDrive {
	public static void main(String[] args) {
		// Duck을 생성합니다.
		Duck duck = new MallardDuck();
		// Turkey 도 만듭니다.
		Turkey turkey = new WildTurkey();
		
		// Turkey는 TurkeyAdapter로 감싸서 Duck처럼 보이도록 만듭니다.
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		/*
		 * Turkey 자체를 테스트 합니다.
		 * 골골거리는 소리도 내게 하고 날게도 해봅니다.
		 */
		System.out.println("The turkey says ...");
		turkey.gobble();
		turkey.fly();
		
		/*
		 * Duck 객체를 전달해야 되는 testDuck() 메소드를 호출해서
		 * Duck 객체를 테스트합니다.
		 */
		System.out.println("\nThe Duck says ..");
		testDuck(duck);
		
		/*
		 * 가장 중요한 부분: 오리 대신 칠면조를 넘겨 봅시다.
		 */
		System.out.println("\nThe TurkeyAdapter says ...");
		testDuck(turkeyAdapter);
	}
	
	private static void testDuck(Duck duck) {
		/*
		 * testDuck() 메소드 : 오리 객체를 받아서 quack() 과 fly() 메소드를 호출합니다.
		 */
		duck.quack();
		duck.fly();
	}
}

