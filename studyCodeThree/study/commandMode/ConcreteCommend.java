package commandMode;
/**
 * ���������
 * @author hello
 *
 */
public class ConcreteCommend implements Commend {
	CompanyArmy army;
	/**
	 * ���н����ߵ�����
	 * @param army
	 */
	public ConcreteCommend(CompanyArmy army) {
		this.army = army;
	}

	@Override
	public void execute() {
		army.sneakAttack();
	}

}
