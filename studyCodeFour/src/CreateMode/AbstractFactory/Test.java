package CreateMode.AbstractFactory;

public class Test {

	public static void main(String[] args) {
		CreateHumanFactory humanFactory = new CreateManFactory();
		humanFactory.createHuman().say();
		humanFactory = new CreateWomanFactory();
		humanFactory.createHuman().say();
	}

}
