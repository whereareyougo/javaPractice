package abstractFactoryCode;

public class PistolGun extends GunProduct {
	
	public PistolGun() {
		name = "��ǹ";
	}

	@Override
	public void setWeight(int weight) {
		System.out.println(name+"�Ŀھ�:"+weight);
	}

}
