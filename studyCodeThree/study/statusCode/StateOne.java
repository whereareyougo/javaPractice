package statusCode;
/**
 * ���һ���ӵ�
 * @author hello
 *
 */
public class StateOne implements State {
	Context context;
		
	public StateOne(Context context) {
		this.context = context;
	}
	@Override
	public void fire() {
		System.out.println("�������һ���ӵ�,�յ����ˡ�");
		context.setState(context.getStateNull());
	}

	@Override
	public void loadBullet() {
		
	}

	@Override
	public void showStateMess() {
		System.out.println("������һ�ž�û�ӵ���");

	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}
	
	
}
