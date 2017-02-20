package chapter11.proxyPattern.context;

import java.rmi.*;
import java.rmi.server.*;

import chapter11.proxyPattern.proxy.GumballMachineRemote;
import chapter11.proxyPattern.state.HasQuarterState;
import chapter11.proxyPattern.state.NoQuarterState;
import chapter11.proxyPattern.state.SoldOutState;
import chapter11.proxyPattern.state.SoldState;
import chapter11.proxyPattern.state.State;
import chapter11.proxyPattern.state.WinnerState;

/*
 * GumballMachine을 UnicastRemoteObject의 서브클래스로 만들어야 합니다.
 * 이렇게 해야 원격 서비스 역할을 할 수 있게 됩니다.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;
	
	private State state = soldOutState;
	private int count = 0;
	
	/*
	 * location 변수 추가
	 */
	private String location;
	
	/*
	 * 현재 위치를 지원하기 위한 기능 추가!!
	 * 
	 * 슈퍼 클래스에서 RemoteException을 던질 수 있기 때문에
	 * 이 생성자에서도 RemoteException을 던질 수 있도록 해야합니다.
	 */
	public GumballMachine(String location, int numberGumballs) throws RemoteException{
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
		
		this.location = location;
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
	
	/*
	 * 위치를 알아내기 위한 용도로 호출할 수 있는 게터 메소드 추가
	 */
	public String getLocation() {
		return location;
	}

	public State getState() {
		return state;
	}
}
