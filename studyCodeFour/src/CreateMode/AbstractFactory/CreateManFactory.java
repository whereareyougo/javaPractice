package CreateMode.AbstractFactory;

/**
 * �������˹���
 * @author hello
 *
 */
public class CreateManFactory implements CreateHumanFactory {

	@Override
	public HumanAbstract createHuman() {
		return new Man();
	}

}
