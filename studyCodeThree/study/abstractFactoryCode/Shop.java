package abstractFactoryCode;
/**
 * 武器商店
 * @author hello
 *
 */
public class Shop {
	GunProduct gunProduct;
	Bullet bullet;
	
	public void giveGunAndBullet(ArmsAbstractFactory factory,int weight,int caliber ){
		gunProduct = factory.createGun();
		bullet = factory.createBullet();
		gunProduct.setWeight(weight);
		bullet.setCaliber(caliber);
		showMess();
	}
	
	public void showMess(){
		System.out.println("武器信息");
		System.out.println("武器的名称:"+gunProduct.name);
		System.out.println("武器的子弹:"+bullet.name);
	}
}
