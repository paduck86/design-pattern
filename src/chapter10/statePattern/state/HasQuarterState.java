package chapter10.statePattern.state;

import java.util.Random;

import chapter10.statePattern.context.GumballMachine;

public class HasQuarterState implements State {
	/*
	 * 우선 10%의 확률로 당첨여부를 결정하는 난수 발생기를 추가합니다.
	 */
	private Random ramdomWinner = new Random(System.currentTimeMillis());
	private GumballMachine gumballMachine;
	
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

}
