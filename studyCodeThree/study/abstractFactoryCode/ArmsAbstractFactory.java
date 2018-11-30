package abstractFactoryCode;
/**
 * 武器抽象生产工厂
 * @author hello
 *
 */
public abstract class ArmsAbstractFactory {
	public abstract GunProduct createGun();
	public abstract Bullet createBullet();
}
