package ConstructCode.Proxy.Dynamic.Practice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 对象处理类
 * @author hello
 *
 */
public class SubjectHandler implements InvocationHandler {
	private Object ob;
	
	public SubjectHandler(Object ob) {
		this.ob = ob;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(ob, args);
		return result;
	}

}
