package abstractFactoryCode;

public class Application {

	public static void main(String[] args) {
		Shop shop = new Shop();
		ArmsAbstractFactory factory = new PistolFactory();
		shop.giveGunAndBullet(factory, 10, 11);
		factory = new MachineGunFactory();
		shop.giveGunAndBullet(factory, 20, 22);
	}

}
