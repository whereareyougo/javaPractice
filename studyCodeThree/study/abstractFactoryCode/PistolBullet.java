package abstractFactoryCode;

public class PistolBullet extends Bullet {
	
	public PistolBullet() {
		name = "手枪的子弹";
	}
	
	@Override
	public void setCaliber(int caliber) {
		System.out.println(name+"的口径"+caliber);
	}

}
