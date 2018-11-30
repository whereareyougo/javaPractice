package ConstructCode.Proxy.Staitc;

public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCash(3000);
		BuyCarProxy buyCarProxy = new BuyCarProxy(customer);
		buyCarProxy.buyCar();  
	}

}
