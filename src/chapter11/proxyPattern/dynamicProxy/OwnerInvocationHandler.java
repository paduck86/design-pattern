package chapter11.proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * ȣ�� �ڵ鷯������ �ݵ�� InvocationHandler �������̽��� �����ؾ� �մϴ�.
 */
public class OwnerInvocationHandler implements InvocationHandler {
	private PersonBean person;
	
	/*
	 * �����ڸ� ���� ���޹��� �� ��ü�� ���� ���۷����� ������ �Ӵϴ�.
	 */
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	/*
	 * ���Ͻ� �޼ҵ尡 ȣ��� ������ ȣ��Ǵ� invoke() �޼ҵ�
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			/*
			 * get �޼ҵ��� ��쿡�� �� ��ü�� �޼ҵ带 ȣ���մϴ�.
			 */
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			/*
			 * setHotOrNot() �޼ҵ��� ��쿡�� IllegalAccessException ���ܸ� ������ �ź��մϴ�.	
			 */
			} else if (method.getName().equals("setHotOrNotRating")) {
				throw new IllegalAccessException();
			/*
			 * �������״� ������ �޼ҵ带 ��� �������� �ϹǷ� 
			 * �� ��ü�� �ִ� �޼ҵ带 ȣ���մϴ�. 
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
