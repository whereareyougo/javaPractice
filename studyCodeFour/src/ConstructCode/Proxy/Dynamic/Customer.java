package ConstructCode.Proxy.Dynamic;

public class Customer implements IBuycar {
	private int cash;
	
	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	@Override
	public void buycar() {
		System.out.println("Âò³µ»¨ÁË"+getCash());
	}

}
