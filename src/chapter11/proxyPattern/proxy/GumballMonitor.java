package chapter11.proxyPattern.proxy;

import chapter11.proxyPattern.context.GumballMachine;

public class GumballMonitor {
	GumballMachine machine;
	
	/*
	 * �� Ŭ���������� �����ڸ� ���ؼ� �̱� ��踦 ���޹ް�,
	 * �� ��ü�� �ν��Ͻ� ������ �����մϴ�.
	 */
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}
	
	public void report() {
		System.out.println("�̱� ��� ��ġ : " + machine.getLocation());
		System.out.println("���� ��� : " + machine.getCount() + " ��");
		System.out.println("���� ���� : " + machine.getState());
	}
}
