package ConstructCode.Proxy.Staitc;
/**
 * �򳵵ľ�̬������
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
