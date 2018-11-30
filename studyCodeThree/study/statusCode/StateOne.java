package statusCode;
/**
 * 最后一颗子弹
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
		System.out.println("打完最后一颗子弹,空弹夹了。");
		context.setState(context.getStateNull());
	}

	@Override
	public void loadBullet() {
		
	}

	@Override
	public void showStateMess() {
		System.out.println("打完这一颗就没子弹啦");

	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}
	
	
}
