package chapter10.statePattern.state;

import chapter10.statePattern.context.GumballMachine;

public class WinnerState implements State {
	private GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
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

	/*
	 * ���⿡���� �˸��̸� �� �� �������� NoQuarterState �Ǵ� SoldOutState�� ���ϴ�.
	 */
	@Override
	public void dispense() {
		System.out.println("���ϵ帳�ϴ�! �˸��̸� �ϳ� �� ������ �� �ֽ��ϴ�.");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("�� �̻� �˸��̰� �����ϴ�.");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}