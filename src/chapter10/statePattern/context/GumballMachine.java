package chapter10.statePattern.context;

import chapter10.statePattern.state.HasQuarterState;
import chapter10.statePattern.state.NoQuarterState;
import chapter10.statePattern.state.SoldOutState;
import chapter10.statePattern.state.SoldState;
import chapter10.statePattern.state.State;
import chapter10.statePattern.state.WinnerState;

public class GumballMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;
	
	private State state = soldOutState;
	private int count = 0;
	
	/*
	 * �����ڿ����� �˸����� �ʱ� ������ ���ڷ� �޾Ƽ� �ν��Ͻ� ������ �����մϴ�.
	 * �׸��� State �ν��Ͻ��� ���� �ϳ��� �����մϴ�.
	 */
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		/*
		 * �˸��� ������ 0������ ������ state�� NoQuarterState�� �����մϴ�.
		 */
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	/*
	 * �޼ҵ带 �����ϴ� �κ�.
	 * �׳� ���� ���·� �Ͽ��� �۾��� ó���ϰ� ����ϴ�.
	 * �����ϱⰡ ���� ����.
	 */
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	/*
	 * �� �޼ҵ带 �̿��ϸ� (�� �ȿ� ����ִ� State ��ü�� �����)
	 * �ٸ� ��ü���� �̱� ����� ���¸� �ٸ� ���·� ��ȯ��ų �� �ֽ��ϴ�. 
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/*
	 * �˸��̸� �������� count �ν��Ͻ� ������ ���� 1 ���̱� ����
	 * ���� �޼ҵ��� releaseBall() �޼ҵ带 �����մϴ�.
	 */
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count--;
		}
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state.getClass().getName() + ", count=" + count + "]";
	}
	
}
