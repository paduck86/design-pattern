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
	 * 생성자에서는 알맹이의 초기 개수를 인자로 받아서 인스턴스 변수에 저장합니다.
	 * 그리고 State 인스턴스도 각각 하나씩 생성합니다.
	 */
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		/*
		 * 알맹이 개수가 0개보다 많으면 state를 NoQuarterState로 설정합니다.
		 */
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	/*
	 * 메소드를 구현하는 부분.
	 * 그냥 현재 상태로 하여금 작업을 처리하게 만듭니다.
	 * 구현하기가 정말 쉽죠.
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
	 * 이 메소드를 이용하면 (이 안에 들어있는 State 객체를 비롯한)
	 * 다른 객체에서 뽑기 기계의 상태를 다른 상태로 전환시킬 수 있습니다. 
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/*
	 * 알맹이를 내보내고 count 인스턴스 변수의 값을 1 줄이기 위한
	 * 보조 메소드인 releaseBall() 메소드를 지원합니다.
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
