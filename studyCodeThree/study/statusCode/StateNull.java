package statusCode;

public class StateNull implements State {
	Context context;
	
	public StateNull(Context context) {
		this.context = context;
	}
	@Override
	public void fire() {

	}

	@Override
	public void loadBullet() {
		System.out.println("×°µ¯");
		context.setState(context.getStateTwo());
	}

	@Override
	public void showStateMess() {
		// TODO Auto-generated method stub

	}

}
