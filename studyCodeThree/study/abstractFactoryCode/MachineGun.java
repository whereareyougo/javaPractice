package abstractFactoryCode;

public class MachineGun extends GunProduct {
	
	public MachineGun() {
		name = "机关枪";
	}
	
	@Override
	public void setWeight(int weight) {
		System.out.println(name+"的口径"+weight);
	}

}
