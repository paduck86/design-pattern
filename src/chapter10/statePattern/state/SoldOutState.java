package chapter10.statePattern.state;

import chapter10.statePattern.context.GumballMachine;

public class SoldOutState implements State {
	private GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("�����Ǿ����ϴ�. ���� ��ȸ�� �̿����ּ���.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("������ �־��ּ���.");
	}

	@Override
	public void turnCrank() {
		System.out.println("���� �Ǿ����ϴ�.");
	}

	@Override
	public void dispense() {
		System.out.println("���� �Ǿ����ϴ�.");
	}

}
