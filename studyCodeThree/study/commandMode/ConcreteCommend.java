package commandMode;
/**
 * 具体的命令
 * @author hello
 *
 */
public class ConcreteCommend implements Commend {
	CompanyArmy army;
	/**
	 * 含有接收者的引用
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
