package ConstructCode.Proxy.Staitc;
/**
 * 顾客
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
		System.out.println("买车需要花费"+getCash());
	}

}
