package chapter10.statePattern.state;

import chapter10.statePattern.context.GumballMachine;

public class SoldOutState implements State {
	private GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public void turnCrank() {
		System.out.println("매진 되었습니다.");
	}

	@Override
	public void dispense() {
		System.out.println("매진 되었습니다.");
	}

}
