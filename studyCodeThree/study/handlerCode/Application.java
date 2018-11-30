package handlerCode;

public class Application {
	
	private Handler beijing,shanghai,chengdu;
	
	public void createChain(){
		beijing = new Beijing();
		shanghai = new Shanghai();
		chengdu = new Chengdu();
		beijing.setNextHandler(shanghai);
		shanghai.setNextHandler(chengdu);
	}
	
	public void responseClient(String number){
		beijing.handleRequest(number);
	}

	public static void main(String[] args) {
		Application application = new Application();
		application.createChain();
		application.responseClient("1");
	}

}
