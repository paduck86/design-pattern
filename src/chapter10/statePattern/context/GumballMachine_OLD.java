package chapter10.statePattern.context;

public class GumballMachine_OLD {
	/*
	 * �װ��� ����, �ֽ�ȸ�� �ջ̱⿡�� ������ ���� ���̾�׷��� ���缭
	 * �����߽��ϴ�.
	 */
	private final static int SOLD_OUT = 0;
	private final static int NO_QUARTER = 1;
	private final static int HAS_QUARTER = 2;
	private final static int SOLD = 3;
	
	/*
	 * ���� ���¸� �����ϱ� ���� �ν��Ͻ� ����.
	 * �ʱⰪ�� SOLD_OUT ���� �����մϴ�.
	 */
	private int state = SOLD_OUT;
	/*
	 * ��迡 ����ִ� �˸����� ������ �����ϱ� ���� �� ��° �ν��Ͻ� ����
	 */
	private int count = 0;
	
	/*
	 * �����ڿ����� �ʱ� �˸��� ������ ���ڷ� �޾Ƶ��Դϴ�.
	 * �˸��� ������ 0�� �ƴϸ� �������� ������ �ֱ⸦ ��ٸ��� �ִ� NO_QUARTER ���·� ��ȯ�˴ϴ�.
	 * �˸��� ������ 0�̸� �׳� SOLD_OUT ���¿��� �ӹ����� �˴ϴ�.
	 */
	public GumballMachine_OLD(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
	
	/*
	 * �ൿ�� �޼ҵ�� �����մϴ�.
	 */
	public void insertQuarter() {
		/*
		 * ������ ���ԵȰ��
		 * ������ �̹� ���ԵǾ� �ִ� ��쿡�� ������ �̹� ����ִٰ� �˸��ϴ�.
		 */
		
		if (state == HAS_QUARTER) {
			System.out.println("������ �� ���� �־��ּ���.");
		} else if (state == NO_QUARTER) {
			/*
			 * ������ ���Ե��� ���� ���
			 * ������ ���� ���� HAS_QUARTER ���·� �Ѿ�ϴ�.
			 */
			state = HAS_QUARTER;
			System.out.println("������ �����̽��ϴ�.");
		} else if (state == SOLD_OUT) {
			/*
			 * ���� ���¿����� ������ ��ȯ�մϴ�.
			 */
			System.out.println("�����Ǿ����ϴ�. ���� ��ȸ�� �̿����ּ���.");
		} else if (state == SOLD) {
			/*
			 * ��� �����̸� ������ ���� �˸��� �ǸŻ��¿� �ִٸ� 
			 * ���� �� ��ٷ� �޶�� �޽����� ����մϴ�.
			 */
			System.out.println("��� ��ٷ��ּ���. �˸��̰� ������ �ֽ��ϴ�.");
		}
	}
	
	/*
	 * ����ڰ� ������ ��ȯ �������� �ϴ� ��� 
	 */
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("������ ��ȯ�˴ϴ�.");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("������ �־��ּ���.");
		} else if (state == SOLD) {
			System.out.println("�̹� �˸��̸� �����̽��ϴ�.");
		} else if (state == SOLD_OUT) {
			System.out.println("������ ���� �����̽��ϴ�. ������ ��ȯ���� �ʽ��ϴ�.");
		}
	}
	
	/*
	 * �����̸� ������ ���
	 */
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("�����̴� �� ���� �����ּ���.");
		} else if (state == NO_QUARTER) {
			System.out.println("������ �־��ּ���.");
		} else if (state == SOLD_OUT) {
			System.out.println("�����Ǿ����ϴ�.");
		} else if (state == HAS_QUARTER) {
			System.out.println("�����̸� �����̽��ϴ�.");
			state = SOLD;
			dispense();
		}
	}
	
	/*
	 * �˸��� ������
	 */
	public void dispense() {
		if (state == SOLD) {
			System.out.println("�˸��̰� ������ �ֽ��ϴ�.");
			count--;
			if(count == 0) {
				System.out.println("�� �̻� �˸��̰� �����ϴ�.");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("������ �־��ּ���.");
		} else if (state == SOLD_OUT) {
			System.out.println("�����Դϴ�.");
		} else if (state == HAS_QUARTER) {
			System.out.println("�˸��̰� ���� �� �����ϴ�.");
		}
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}
	
	
}
