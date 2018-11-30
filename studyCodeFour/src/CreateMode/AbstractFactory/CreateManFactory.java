package CreateMode.AbstractFactory;

/**
 * 创建男人工厂
 * @author hello
 *
 */
public class CreateManFactory implements CreateHumanFactory {

	@Override
	public HumanAbstract createHuman() {
		return new Man();
	}

}
