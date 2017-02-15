package chapter7.adapterPattern.adaptee;

public interface Turkey {
	public void gobble(); // 칠면조는 꽥꽥거리지 않습니다. 골골거리는 소리를 내죠.
	public void fly(); // 칠면조도 날 수 있깁 합니다. 별로 멀리 날아갈 수 없습니다.
}
