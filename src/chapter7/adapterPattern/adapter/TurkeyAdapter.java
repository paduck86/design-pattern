package chapter7.adapterPattern.adapter;

import chapter7.adapterPattern.adaptee.Turkey;
import chapter7.adapterPattern.target.Duck;

/*
 * 우선 적응시킬 형식의 인터페이스를 구현해야 합니다.
 * 클라이언트에서 원하는 인터페이스를 구현해야 되죠.
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	/*
	 * 그리고 원래 형식의 객체에 대한 레퍼런스가 필요합니다.
	 * 여기에서는 생성자에서 레퍼런스를 받아오는 작업을 처리합니다.
	 */
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	/*
	 * 인터페이스에 들어있는 메소드들을 모두 구현해야 합니다.
	 * quack()은 간단합니다. 그냥 gobble()메소드를 호출하면 되죠.
	 */
	@Override
	public void quack() {
		turkey.gobble();
	}

	/*
	 * 두 인터페이스에 모두 fly()가 들어있었지만 칠면조는 오리처럼 멀리 날지 못합니다.
	 * Turkey의 fly()메소드를 Duck의 fly()메소드에 대응시키기 위해 Turkey의 fly() 메소드를 다섯 번 호출해서
	 * 좀 더 멀리 움직이도록 했습니다.
	 */
	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

}
