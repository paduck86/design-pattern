package chapter11.proxyPattern.proxy;

import chapter11.proxyPattern.context.GumballMachine;

public class GumballMonitor {
	GumballMachine machine;
	
	/*
	 * 이 클래스에서는 생성자를 통해서 뽑기 기계를 전달받고,
	 * 그 객체를 인스턴스 변수에 저장합니다.
	 */
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}
	
	public void report() {
		System.out.println("뽑기 기계 위치 : " + machine.getLocation());
		System.out.println("현재 재고 : " + machine.getCount() + " 개");
		System.out.println("현재 상태 : " + machine.getState());
	}
}
