package ConstructCode.Proxy.Staitc;
/**
 * �˿�
 * @author hello
 *
 */
public class Customer implements IBuyCar {
	private int cash;
	
	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	@Override
	public void buyCar() {
		System.out.println("����Ҫ����"+getCash());
	}

}
