package abstractFactoryCode;

public class PistolFactory extends ArmsAbstractFactory {

	@Override
	public GunProduct createGun() {
		return new PistolGun();
	}

	@Override
	public Bullet createBullet() {
		return new PistolBullet();
	}

}
