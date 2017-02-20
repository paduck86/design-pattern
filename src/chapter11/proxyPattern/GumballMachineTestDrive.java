package chapter11.proxyPattern;

import java.rmi.Naming;

import chapter11.proxyPattern.context.GumballMachine;
import chapter11.proxyPattern.proxy.GumballMonitor;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		int count = 0;
		
		/*
		 * 명령행에서 위치와 초기 알맹이 개수를 입력하도록 만들었습니다.
		 */
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		
		try {
			/*
			 * RMI 레지스트리 등록
			 */
			count = Integer.parseInt(args[1]);
			GumballMachine gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballmachine",  gumballMachine);
			
			//GumballMonitor monitor = new GumballMonitor(gumballMachine);
			//monitor.report();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
