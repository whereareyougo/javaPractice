package statusCode;

public class StateTwo implements State {
	Context context;
	
	public StateTwo(Context context) {
		this.context = context;
	}
	
	@Override
	public void fire() {
		System.out.println("�����һ���ӵ�����ʣһ��!");
		context.setState(context.getStateOne());
	}

	@Override
	public void loadBullet() {
		
	}

	@Override
	public void showStateMess() {
		// TODO Auto-generated method stub

	}

}
