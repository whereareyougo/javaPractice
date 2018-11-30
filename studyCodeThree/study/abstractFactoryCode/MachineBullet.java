package abstractFactoryCode;

public class MachineBullet extends Bullet {
	
	public MachineBullet() {
		name = "机关枪的子弹";
	}
	
	@Override
	public void setCaliber(int caliber) {
		System.out.println(name+"的口径"+caliber);
	}

}
