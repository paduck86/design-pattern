package chapter11.proxyPattern.state;

import chapter11.proxyPattern.context.GumballMachine;

public class SoldState implements State {
	private transient GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("��� ��ٷ� �ּ���. �˸��̰� ������ �ֽ��ϴ�.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("�̹� �˸��̸� �����̽��ϴ�.");
	}

	@Override
	public void turnCrank() {
		System.out.println("�����̴� �� ���� �����ּ���.");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
	@Override
	public String toString() {
		return this.getClass().getName();
	}

}
