package chapter11.proxyPattern.proxy;
import java.rmi.Remote;
import java.rmi.RemoteException;

import chapter11.proxyPattern.state.State;

/*
 * 모든 리턴 형식은 원시 형식 또는 Serialigable 이어야 합니다.
 * 지원해야 하는 메소드, 모두 RemoteException을 던질 수 있습니다.
 */
public interface GumballMachineRemote extends Remote{
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
