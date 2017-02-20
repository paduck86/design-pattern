package chapter11.proxyPattern.proxy;
import java.rmi.Remote;
import java.rmi.RemoteException;

import chapter11.proxyPattern.state.State;

/*
 * ��� ���� ������ ���� ���� �Ǵ� Serialigable �̾�� �մϴ�.
 * �����ؾ� �ϴ� �޼ҵ�, ��� RemoteException�� ���� �� �ֽ��ϴ�.
 */
public interface GumballMachineRemote extends Remote{
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
