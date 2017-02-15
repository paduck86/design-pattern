package chapter7.adapterPattern.adapter;

import chapter7.adapterPattern.adaptee.Turkey;
import chapter7.adapterPattern.target.Duck;

/*
 * �켱 ������ų ������ �������̽��� �����ؾ� �մϴ�.
 * Ŭ���̾�Ʈ���� ���ϴ� �������̽��� �����ؾ� ����.
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	/*
	 * �׸��� ���� ������ ��ü�� ���� ���۷����� �ʿ��մϴ�.
	 * ���⿡���� �����ڿ��� ���۷����� �޾ƿ��� �۾��� ó���մϴ�.
	 */
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	/*
	 * �������̽��� ����ִ� �޼ҵ���� ��� �����ؾ� �մϴ�.
	 * quack()�� �����մϴ�. �׳� gobble()�޼ҵ带 ȣ���ϸ� ����.
	 */
	@Override
	public void quack() {
		turkey.gobble();
	}

	/*
	 * �� �������̽��� ��� fly()�� ����־����� ĥ������ ����ó�� �ָ� ���� ���մϴ�.
	 * Turkey�� fly()�޼ҵ带 Duck�� fly()�޼ҵ忡 ������Ű�� ���� Turkey�� fly() �޼ҵ带 �ټ� �� ȣ���ؼ�
	 * �� �� �ָ� �����̵��� �߽��ϴ�.
	 */
	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

}
