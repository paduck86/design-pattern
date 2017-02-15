package chapter7.adapterPattern;

import chapter7.adapterPattern.adaptee.Turkey;
import chapter7.adapterPattern.adaptee.WildTurkey;
import chapter7.adapterPattern.adapter.TurkeyAdapter;
import chapter7.adapterPattern.target.Duck;
import chapter7.adapterPattern.target.MallardDuck;

public class DuckTestDrive {
	public static void main(String[] args) {
		// Duck�� �����մϴ�.
		Duck duck = new MallardDuck();
		// Turkey �� ����ϴ�.
		Turkey turkey = new WildTurkey();
		
		// Turkey�� TurkeyAdapter�� ���μ� Duckó�� ���̵��� ����ϴ�.
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		/*
		 * Turkey ��ü�� �׽�Ʈ �մϴ�.
		 * ���Ÿ��� �Ҹ��� ���� �ϰ� ���Ե� �غ��ϴ�.
		 */
		System.out.println("The turkey says ...");
		turkey.gobble();
		turkey.fly();
		
		/*
		 * Duck ��ü�� �����ؾ� �Ǵ� testDuck() �޼ҵ带 ȣ���ؼ�
		 * Duck ��ü�� �׽�Ʈ�մϴ�.
		 */
		System.out.println("\nThe Duck says ..");
		testDuck(duck);
		
		/*
		 * ���� �߿��� �κ�: ���� ��� ĥ������ �Ѱ� ���ô�.
		 */
		System.out.println("\nThe TurkeyAdapter says ...");
		testDuck(turkeyAdapter);
	}
	
	private static void testDuck(Duck duck) {
		/*
		 * testDuck() �޼ҵ� : ���� ��ü�� �޾Ƽ� quack() �� fly() �޼ҵ带 ȣ���մϴ�.
		 */
		duck.quack();
		duck.fly();
	}
}

