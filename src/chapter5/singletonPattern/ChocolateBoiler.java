package chapter5.singletonPattern;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	/*
	 * volatile Ű���带 ����ϸ� ��Ƽ�������� ������
	 * uniqueInstance ������ Singleton �ν��Ͻ��� �ʱ�ȭ �Ǵ� ������ �ùٸ��� ����ǵ��� �� �� �ֽ��ϴ�.
	 */
	public volatile static ChocolateBoiler chocolateBoiler;
	
	/*
	 * �� �ڵ�� ���Ϸ��� ������� ���� ���ư��ϴ�.
	 */
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		/*
		 * �ν��Ͻ��� �ִ��� Ȯ���ϰ�, ������ ����ȭ�� ������ ���ϴ�.
		 * �̷��� �ϸ� ó������ ����ȭ �˴ϴ�.
		 */
		if (chocolateBoiler == null) {
			synchronized (ChocolateBoiler.class) {
				/*
				 * ������� ���� �Ŀ��� �ٽ� �� �� ������ null���� Ȯ���� ���� �ν��Ͻ��� �����մϴ�.
				 */
				if (chocolateBoiler == null) {
					chocolateBoiler = new ChocolateBoiler();
				}
			}
		} 
		return chocolateBoiler;
	}

	/*
	 * ���Ϸ��� ������� ���� ��Ḧ ���� �ֽ��ϴ�.
	 * ���Ḧ ���� ä��� ���� empty�� boiled �÷��׸� false �� �����մϴ�.
	 */
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// ���Ϸ��� ����/���ݸ��� ȥ���� ��Ḧ �������
		}
	}
	
	/*
	 * ���Ϸ��� ���� �� �ְ�(������� �ʰ�), �� ������ ���¿����� ���Ϸ��� ����ִ� ��Ḧ ���� �ܰ�� �ѱ�ϴ�.
	 * ���Ϸ��� �� ���� ���� empty �÷��׸� �ٽ� true�� �����մϴ�. 
	 */
	public void drain() {
		if (isEmpty() && isBoiled()) {
			// ���� ��Ḧ ���� �ܰ�� �ѱ�
			empty = true;
		}
	}
	
	/*
	 * ���Ϸ��� ���� �� �ְ� ���� ���� ���� ���¿����� ���ݸ��� ������ ȥ�յ� ��Ḧ ���Դϴ�.
	 * ��ᰡ �� ���� ���� boiled �÷��׸� true�� �����մϴ�.
	 */
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// ��Ḧ ����
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
