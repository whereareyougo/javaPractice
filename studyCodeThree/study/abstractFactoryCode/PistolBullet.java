package abstractFactoryCode;

public class PistolBullet extends Bullet {
	
	public PistolBullet() {
		name = "��ǹ���ӵ�";
	}
	
	@Override
	public void setCaliber(int caliber) {
		System.out.println(name+"�Ŀھ�"+caliber);
	}

}
