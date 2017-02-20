package chapter10.statePattern.state;

import chapter10.statePattern.context.GumballMachine;

/*
 * �� ���¿� ���� ������ �ൿ�� �����մϴ�.
 * ��Ȳ�� ���� �̱� ����� ���°� �ٸ� ���·� ��ȯ�Ǵ� ��쵵 �ֽ��ϴ�.
 */
public class NoQuarterState implements State {
	private GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("������ �����̽��ϴ�.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("������ �־��ּ���.");
	}

	@Override
	public void turnCrank() {
		System.out.println("������ �־��ּ���.");
	}

	@Override
	public void dispense() {
		System.out.println("������ �־��ּ���.");
	}

}
