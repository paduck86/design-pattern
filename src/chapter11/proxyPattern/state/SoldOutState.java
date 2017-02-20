package chapter11.proxyPattern.state;

import chapter11.proxyPattern.context.GumballMachine;

public class SoldOutState implements State {
	private transient GumballMachine gumballMachine;
	
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
