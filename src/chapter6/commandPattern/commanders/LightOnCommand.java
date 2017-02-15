package chapter6.commandPattern.commanders;

import chapter6.commandPattern.receivers.Light;

public class LightOnCommand implements Command{
	Light light;
	
	/*
	 * �����ڿ� �� Ŀ�ǵ� ��ü�� ������ Ư�� ��� ���� ������ ���޵˴ϴ�. 
	 * ("�Ž� ����" �̷� ������ � ���������� �˷���� �� �״ϱ��)
	 * �� ��ü�� light��� �ν��Ͻ� ������ ������ ������.
	 * execute() �޼ҵ尡 ȣ��Ǹ� light ��ü�� �ٷ� �� ��û�� ���� ���ù�(Receiver)�� �˴ϴ�.
	 */
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	/*
	 * execute() �޼ҵ忡���� ���ù� ��ü (���⼭ �����ϴ� light ��ü) �� �ִ� on() �޼ҵ带 ȣ���մϴ�.
	 */
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
		
	}
	
}
