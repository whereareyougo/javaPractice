package facadeCode;

public class Application {

	public static void main(String[] args) {
		ClientFacade clientFacade = new ClientFacade("欢迎大家来到四川游玩");
		clientFacade.doAdver();
	}

}
