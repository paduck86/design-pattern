package chapter11.proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 호출 핸들러에서는 반드시 InvocationHandler 인터페이스를 구현해야 합니다.
 */
public class OwnerInvocationHandler implements InvocationHandler {
	private PersonBean person;
	
	/*
	 * 생성자를 통해 전달받은 후 객체에 대한 레퍼런스를 저장해 둡니다.
	 */
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	/*
	 * 프록시 메소드가 호출될 때마다 호출되는 invoke() 메소드
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			/*
			 * get 메소드인 경우에는 주 객체의 메소드를 호출합니다.
			 */
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			/*
			 * setHotOrNot() 메소드인 경우에는 IllegalAccessException 예외를 던져서 거부합니다.	
			 */
			} else if (method.getName().equals("setHotOrNotRating")) {
				throw new IllegalAccessException();
			/*
			 * 본인한테는 나머지 메소드를 모두 허용해줘야 하므로 
			 * 주 객체에 있는 메소드를 호출합니다. 
			 */	
			} else if (method.getName().startsWith("set")) {
				return method.invoke(person, args);
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
