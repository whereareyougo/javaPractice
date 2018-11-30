package CreateMode.AbstractFactory;
/**
 * 创建女人的工厂
 * @author hello
 *
 */
public class CreateWomanFactory implements CreateHumanFactory {

	@Override
	public HumanAbstract createHuman() {
		return new Woman();
	}

}
