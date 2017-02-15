package chapter6.commandPattern.invokers;

import chapter6.commandPattern.commanders.Command;

public class SimpleRemoteControl {
	/*
	 * Ŀ�ǵ带 ������� ������ �ϳ��ۿ� �����ϴ�.
	 * �̰� ������ ��� ������ �� �ֽ��ϴ�.
	 */
	Command slot;
	
	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * ������ ������ ������ ����� �����ϱ� ���� �޼ҵ�,
	 * �� �ڵ带 ����ϴ� Ŭ���̾�Ʈ���� ������ ��ư�� ����� �ٲٰ� �ʹٸ� 
	 * �� �޼ҵ带 �̿��ؼ� �󸶵��� �ٲ� �� �ֽ��ϴ�.
	 */
	public void setCommand(Command command) {
		slot = command;
	}
	
	/*
	 * ��ư�� �������� �� �޼ҵ尡 ȣ��˴ϴ�.
	 * ���� ���Կ� ����� Ŀ�ǵ� ��ü�� execute() �޼ҵ常 ȣ���ϸ� �˴ϴ�.
	 */
	public void buttonWasPressed() {
		slot.execute();
	}
}
