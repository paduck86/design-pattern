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
 * GumballMachine�� UnicastRemoteObject�� ����Ŭ������ ������ �մϴ�.
 * �̷��� �ؾ� ���� ���� ������ �� �� �ְ� �˴ϴ�.
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
	 * location ���� �߰�
	 */
	private String location;
	
	/*
	 * ���� ��ġ�� �����ϱ� ���� ��� �߰�!!
	 * 
	 * ���� Ŭ�������� RemoteException�� ���� �� �ֱ� ������
	 * �� �����ڿ����� RemoteException�� ���� �� �ֵ��� �ؾ��մϴ�.
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
	
	/*
	 * ��ġ�� �˾Ƴ��� ���� �뵵�� ȣ���� �� �ִ� ���� �޼ҵ� �߰�
	 */
	public String getLocation() {
		return location;
	}

	public State getState() {
		return state;
	}
}
