package abstractFactoryCode;
/**
 * �����̵�
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
		System.out.println("������Ϣ");
		System.out.println("����������:"+gunProduct.name);
		System.out.println("�������ӵ�:"+bullet.name);
	}
}
