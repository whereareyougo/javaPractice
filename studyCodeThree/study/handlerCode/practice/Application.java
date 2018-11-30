package handlerCode.practice;

public class Application {
	private FactorialHandler intHandler,longHandler,bigHandler;
	
	
	public Application() {
		
	}
	
	public void createChain(){
		intHandler = new IntFacHandler();
		longHandler = new LongFacHandler();
		bigHandler = new BigIntFacHandler();
		intHandler.setNextFacHandler(longHandler);
		longHandler.setNextFacHandler(bigHandler);
	}
	
	public void clientMake(int i){
		intHandler.computingFacHandler(i);
	}

	public static void main(String[] args) {
		Application application = new Application();
		application.createChain();
		application.clientMake(1000);
	}

}
