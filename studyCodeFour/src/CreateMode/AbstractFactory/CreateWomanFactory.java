package CreateMode.AbstractFactory;
/**
 * ����Ů�˵Ĺ���
 * @author hello
 *
 */
public class CreateWomanFactory implements CreateHumanFactory {

	@Override
	public HumanAbstract createHuman() {
		return new Woman();
	}

}
