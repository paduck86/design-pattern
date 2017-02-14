package chapter5.singletonPattern;

/*
 * �̱��� ���� ������
 */
public class Singleton {
	/*
	 * volatile Ű���带 ����ϸ� ��Ƽ�������� ������
	 * uniqueInstance ������ Singleton �ν��Ͻ��� �ʱ�ȭ �Ǵ� ������ �ùٸ��� ����ǵ��� �� �� �ֽ��ϴ�.
	 */
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		/*
		 * �ν��Ͻ��� �ִ��� Ȯ���ϰ�, ������ ����ȭ�� ������ ���ϴ�.
		 * �̷��� �ϸ� ó������ ����ȭ �˴ϴ�.
		 */
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				/*
				 * ������� ���� �Ŀ��� �ٽ� �� �� ������ null���� Ȯ���� ���� �ν��Ͻ��� �����մϴ�.
				 */
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
