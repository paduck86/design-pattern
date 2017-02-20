package chapter11.proxyPattern.state;

import java.util.Random;

import chapter11.proxyPattern.context.GumballMachine;

public class HasQuarterState implements State {
	/*
	 * �켱 10%�� Ȯ���� ��÷���θ� �����ϴ� ���� �߻��⸦ �߰��մϴ�.
	 */
	private Random ramdomWinner = new Random(System.currentTimeMillis());
	
	/*
	 * JVM ������ �� �ʵ带 ����ȭ ���� �ʽ��ϴ�. 
	 * ������ ��ü�� ����ȭ�ؼ� ���۹��� �Ŀ� �� �ʵ带 ȣ���ϰ� �Ǹ�
	 * �� ���� ���� ���� �� �ִٴ� ���� ����صμ���.
	 */
	private transient GumballMachine gumballMachine;
	
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
	
	@Override
	public String toString() {
		return this.getClass().getName();
	}
}
