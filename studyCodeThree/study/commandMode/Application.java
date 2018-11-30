package commandMode;

public class Application {

	public static void main(String[] args) {
		CompanyArmy 三连 = new CompanyArmy();
		Commend command = new ConcreteCommend(三连);
		ArmySuperior 指挥官 = new ArmySuperior(command);
		指挥官.startExcuteCommand();
	}

}
