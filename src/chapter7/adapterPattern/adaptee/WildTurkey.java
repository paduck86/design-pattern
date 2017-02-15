package chapter7.adapterPattern.adaptee;

public class WildTurkey implements Turkey {
	
	/*
	 * Turkey ���� Ŭ����, Duck ���� Ŭ���������� ����������
	 * ���� �ൿ�� �ϴ��� ����ϴ� ������ �޼ҵ� ������ �����ϰ� ó���߽��ϴ�.
	 */
	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
