package chapter6.commandPattern.commanders;

import chapter6.commandPattern.receivers.Light;

public class LightOnCommand implements Command{
	Light light;
	
	/*
	 * 생성자에 이 커맨드 객체로 제어할 특정 전등에 대한 정보가 전달됩니다. 
	 * ("거실 전등" 이런 식으로 어떤 전등인지를 알려줘야 될 테니까요)
	 * 그 객체는 light라는 인스턴스 변수에 저장이 되지요.
	 * execute() 메소드가 호출되면 light 객체가 바로 그 요청에 대한 리시버(Receiver)가 됩니다.
	 */
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	/*
	 * execute() 메소드에서는 리시버 객체 (여기서 제어하는 light 객체) 에 있는 on() 메소드를 호출합니다.
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
