package abstractFactoryCode;

public class MachineBullet extends Bullet {
	
	public MachineBullet() {
		name = "����ǹ���ӵ�";
	}
	
	@Override
	public void setCaliber(int caliber) {
		System.out.println(name+"�Ŀھ�"+caliber);
	}

}
