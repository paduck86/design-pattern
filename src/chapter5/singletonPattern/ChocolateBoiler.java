package chapter5.singletonPattern;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	/*
	 * volatile 키워드를 사용하면 멀티쓰레딩을 쓰더라도
	 * uniqueInstance 변수가 Singleton 인스턴스로 초기화 되는 과정이 올바르게 진행되도록 할 수 있습니다.
	 */
	public volatile static ChocolateBoiler chocolateBoiler;
	
	/*
	 * 이 코드는 보일러가 비어있을 때만 돌아갑니다.
	 */
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		/*
		 * 인스턴스가 있는지 확인하고, 없으면 동기화된 블럭으로 들어갑니다.
		 * 이렇게 하면 처음에만 동기화 됩니다.
		 */
		if (chocolateBoiler == null) {
			synchronized (ChocolateBoiler.class) {
				/*
				 * 블록으로 들어온 후에도 다시 한 번 변수가 null인지 확인한 다음 인스턴스를 생성합니다.
				 */
				if (chocolateBoiler == null) {
					chocolateBoiler = new ChocolateBoiler();
				}
			}
		} 
		return chocolateBoiler;
	}

	/*
	 * 보일러가 비어있을 때만 재료를 집어 넣습니다.
	 * 원료를 가득 채우고 나면 empty와 boiled 플래그를 false 로 설정합니다.
	 */
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// 보일러에 우유/초콜릿을 혼합한 재료를 집어넣음
		}
	}
	
	/*
	 * 보일러가 가득 차 있고(비어있지 않고), 다 끓여진 상태에서만 보일러에 들어있는 재료를 다음 단계로 넘김니다.
	 * 보일러를 다 비우고 나면 empty 플래그를 다시 true로 설정합니다. 
	 */
	public void drain() {
		if (isEmpty() && isBoiled()) {
			// 끓인 재료를 다음 단계로 넘김
			empty = true;
		}
	}
	
	/*
	 * 보일러가 가득 차 있고 아직 끓지 않은 상태에서만 초콜릿과 우유가 혼합된 재료를 끓입니다.
	 * 재료가 다 끓고 나면 boiled 플래그를 true로 설정합니다.
	 */
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// 재료를 끓임
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
