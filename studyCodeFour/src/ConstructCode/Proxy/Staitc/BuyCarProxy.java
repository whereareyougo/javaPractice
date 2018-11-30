package ConstructCode.Proxy.Staitc;
/**
 * 买车的静态代理类
 * @author hello
 *
 */
public class BuyCarProxy implements IBuyCar {
	
	Customer customer;
	
	public BuyCarProxy(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void buyCar() {
		customer.buyCar();
	}

}
