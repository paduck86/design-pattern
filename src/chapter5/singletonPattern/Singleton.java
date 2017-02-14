package chapter5.singletonPattern;

/*
 * 싱글턴 패턴 구현법
 */
public class Singleton {
	/*
	 * volatile 키워드를 사용하면 멀티쓰레딩을 쓰더라도
	 * uniqueInstance 변수가 Singleton 인스턴스로 초기화 되는 과정이 올바르게 진행되도록 할 수 있습니다.
	 */
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		/*
		 * 인스턴스가 있는지 확인하고, 없으면 동기화된 블럭으로 들어갑니다.
		 * 이렇게 하면 처음에만 동기화 됩니다.
		 */
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				/*
				 * 블록으로 들어온 후에도 다시 한 번 변수가 null인지 확인한 다음 인스턴스를 생성합니다.
				 */
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
