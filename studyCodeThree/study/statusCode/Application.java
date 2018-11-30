package statusCode;

public class Application {

	public static void main(String[] args) {
		Context context = new Context();
		context.fire();
		context.fire();
		context.loadBullet();
		context.fire();
	}

}
