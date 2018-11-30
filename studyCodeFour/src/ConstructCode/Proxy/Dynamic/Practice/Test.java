package ConstructCode.Proxy.Dynamic.Practice;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		Subject subject = new RealSubject();
		SubjectHandler handler = new SubjectHandler(subject);
		Subject s = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
		s.print();
	}

}
