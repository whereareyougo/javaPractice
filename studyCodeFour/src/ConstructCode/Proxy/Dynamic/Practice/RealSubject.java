package ConstructCode.Proxy.Dynamic.Practice;

public class RealSubject implements Subject {

	@Override
	public void print() {
		System.out.println("这是真正的对象。");
	}

}
