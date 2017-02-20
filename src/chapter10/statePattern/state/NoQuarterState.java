package chapter10.statePattern.state;

import chapter10.statePattern.context.GumballMachine;

/*
 * 각 상태에 따라 적절한 행동을 구현합니다.
 * 상황에 따라 뽑기 기계의 상태가 다른 상태로 전환되는 경우도 있습니다.
 */
public class NoQuarterState implements State {
	private GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("동전을 넣으셨습니다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public void turnCrank() {
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public void dispense() {
		System.out.println("동전을 넣어주세요.");
	}

}
