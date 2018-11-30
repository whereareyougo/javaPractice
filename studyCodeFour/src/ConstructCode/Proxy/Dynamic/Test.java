package ConstructCode.Proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCash(3000);
		InvocationHandler dynamicProxy = new DynamicProxy(customer);
		IBuycar buycar =  (IBuycar) Proxy.newProxyInstance(dynamicProxy.getClass().getClassLoader(), customer.getClass().getInterfaces(), dynamicProxy);
		buycar.buycar();
	}

}
