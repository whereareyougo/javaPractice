package commandMode;

public class Application {

	public static void main(String[] args) {
		CompanyArmy ���� = new CompanyArmy();
		Commend command = new ConcreteCommend(����);
		ArmySuperior ָ�ӹ� = new ArmySuperior(command);
		ָ�ӹ�.startExcuteCommand();
	}

}
