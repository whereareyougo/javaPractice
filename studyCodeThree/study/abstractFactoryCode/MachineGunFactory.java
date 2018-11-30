package abstractFactoryCode;

public class MachineGunFactory extends ArmsAbstractFactory {

	@Override
	public GunProduct createGun() {
		return new MachineGun();
	}

	@Override
	public Bullet createBullet() {
		return new MachineBullet();
	}

}
