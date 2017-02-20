package chapter11.proxyPattern.state;

import java.io.Serializable;

/*
 * ����ȭ �Ҽ� ���� ���� ������ Ŭ������ Serializable �� ��ӹ޽��ϴ�.
 * 
 * (�ƹ� �޼ҵ嵵 ����) Serializable �������̽��� Ȯ���ϱ⸸ �ϸ� �˴ϴ�.
 * �̷��� �ϸ� State�� ����Ŭ������ ����ȭ �� �� �ֽ��ϴ�.
 * �� ��Ʈ��ũ�� ���� ������ �� �ֽ��ϴ�.
 */
public interface State extends Serializable{
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
