package abstractFactoryCode;

public class MachineGun extends GunProduct {
	
	public MachineGun() {
		name = "����ǹ";
	}
	
	@Override
	public void setWeight(int weight) {
		System.out.println(name+"�Ŀھ�"+weight);
	}

}
