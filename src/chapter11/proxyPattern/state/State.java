package chapter11.proxyPattern.state;

import java.io.Serializable;

/*
 * 직렬화 할수 없는 리턴 형식의 클래스는 Serializable 을 상속받습니다.
 * 
 * (아무 메소드도 없는) Serializable 인터페이스를 확장하기만 하면 됩니다.
 * 이렇게 하면 State의 서브클래스를 직렬화 할 수 있습니다.
 * 즉 네트워크를 통해 전송할 수 있습니다.
 */
public interface State extends Serializable{
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
