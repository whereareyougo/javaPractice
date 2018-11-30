package abstractFactoryCode;

public class PistolGun extends GunProduct {
	
	public PistolGun() {
		name = "ÊÖÇ¹";
	}

	@Override
	public void setWeight(int weight) {
		System.out.println(name+"µÄ¿Ú¾¶:"+weight);
	}

}
