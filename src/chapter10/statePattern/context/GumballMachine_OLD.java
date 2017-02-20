package chapter10.statePattern.context;

public class GumballMachine_OLD {
	/*
	 * 네가지 상태, 주식회사 왕뽑기에서 제공한 상태 다이어그램에 맞춰서
	 * 정의했습니다.
	 */
	private final static int SOLD_OUT = 0;
	private final static int NO_QUARTER = 1;
	private final static int HAS_QUARTER = 2;
	private final static int SOLD = 3;
	
	/*
	 * 현재 상태를 관리하기 위한 인스턴스 변수.
	 * 초기값은 SOLD_OUT 으로 설정합니다.
	 */
	private int state = SOLD_OUT;
	/*
	 * 기계에 들어있는 알맹이의 개수를 저장하기 위한 두 번째 인스턴스 변수
	 */
	private int count = 0;
	
	/*
	 * 생성자에서는 초기 알맹이 개수를 인자로 받아들입니다.
	 * 알맹이 개수가 0이 아니면 누군가가 동전을 넣기를 기다리고 있는 NO_QUARTER 상태로 전환됩니다.
	 * 알맹이 개수가 0이면 그냥 SOLD_OUT 상태에서 머무르게 됩니다.
	 */
	public GumballMachine_OLD(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
	
	/*
	 * 행동을 메소드로 구현합니다.
	 */
	public void insertQuarter() {
		/*
		 * 동전이 투입된경우
		 * 동전이 이미 투입되어 있는 경우에는 동전이 이미 들어있다고 알립니다.
		 */
		
		if (state == HAS_QUARTER) {
			System.out.println("동전은 한 개만 넣어주세요.");
		} else if (state == NO_QUARTER) {
			/*
			 * 동전이 투입되지 않은 경우
			 * 동전을 받은 다음 HAS_QUARTER 상태로 넘어갑니다.
			 */
			state = HAS_QUARTER;
			System.out.println("동전을 넣으셨습니다.");
		} else if (state == SOLD_OUT) {
			/*
			 * 매진 상태에서는 동전을 반환합니다.
			 */
			System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
		} else if (state == SOLD) {
			/*
			 * 방금 손잡이를 돌려서 아직 알맹이 판매상태에 있다면 
			 * 조금 더 기다려 달라는 메시지를 출력합니다.
			 */
			System.out.println("잠깐만 기다려주세요. 알맹이가 나가고 있습니다.");
		}
	}
	
	/*
	 * 사용자가 동전을 반환 받으려고 하는 경우 
	 */
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("동전이 반환됩니다.");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("동전을 넣어주세요.");
		} else if (state == SOLD) {
			System.out.println("이미 알맹이를 뽑으셨습니다.");
		} else if (state == SOLD_OUT) {
			System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
		}
	}
	
	/*
	 * 손잡이를 돌리는 경우
	 */
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("손잡이는 한 번만 돌려주세요.");
		} else if (state == NO_QUARTER) {
			System.out.println("동전을 넣어주세요.");
		} else if (state == SOLD_OUT) {
			System.out.println("매진되었습니다.");
		} else if (state == HAS_QUARTER) {
			System.out.println("손잡이를 돌리셨습니다.");
			state = SOLD;
			dispense();
		}
	}
	
	/*
	 * 알맹이 꺼내기
	 */
	public void dispense() {
		if (state == SOLD) {
			System.out.println("알맹이가 나가고 있습니다.");
			count--;
			if(count == 0) {
				System.out.println("더 이상 알맹이가 없습니다.");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("동전을 넣어주세요.");
		} else if (state == SOLD_OUT) {
			System.out.println("매진입니다.");
		} else if (state == HAS_QUARTER) {
			System.out.println("알맹이가 나갈 수 없습니다.");
		}
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}
	
	
}
