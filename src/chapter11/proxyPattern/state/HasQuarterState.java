package chapter11.proxyPattern.state;

import java.util.Random;

import chapter11.proxyPattern.context.GumballMachine;

public class HasQuarterState implements State {
	/*
	 * 우선 10%의 확률로 당첨여부를 결정하는 난수 발생기를 추가합니다.
	 */
	private Random ramdomWinner = new Random(System.currentTimeMillis());
	
	/*
	 * JVM 에서는 이 필드를 직렬화 하지 않습니다. 
	 * 하지만 객체를 직렬화해서 전송받은 후에 이 필드를 호출하게 되면
	 * 안 좋은 일이 생길 수 있다는 것을 기억해두세요.
	 */
	private transient GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("동전은 한 개만 넣어주세요.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("동전이 반환됩니다.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이를 돌리셨습니다.");
		/*
		 * 그리고 지금 손잡이를 돌린 손님이 당첨되었는지 확인합니다.
		 */
		int winner = ramdomWinner.nextInt(10);
		System.out.println("당첨??" + winner);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다.");
	}
	
	@Override
	public String toString() {
		return this.getClass().getName();
	}
}
