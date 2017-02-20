package chapter10.statePattern.state;

import java.util.Random;

import chapter10.statePattern.context.GumballMachine;

public class HasQuarterState implements State {
	/*
	 * �켱 10%�� Ȯ���� ��÷���θ� �����ϴ� ���� �߻��⸦ �߰��մϴ�.
	 */
	private Random ramdomWinner = new Random(System.currentTimeMillis());
	private GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("������ �� ���� �־��ּ���.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("������ ��ȯ�˴ϴ�.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("�����̸� �����̽��ϴ�.");
		/*
		 * �׸��� ���� �����̸� ���� �մ��� ��÷�Ǿ����� Ȯ���մϴ�.
		 */
		int winner = ramdomWinner.nextInt(10);
		System.out.println("��÷??" + winner);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("�˸��̰� ���� �� �����ϴ�.");
	}

}
