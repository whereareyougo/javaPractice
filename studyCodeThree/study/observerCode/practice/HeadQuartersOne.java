package observerCode.practice;

public class HeadQuartersOne implements HeadQuarters {

	@Override
	public void getHydrologicMsg(String msg) {
		System.out.println("我是指挥部得到的消息:"+msg);
	}

}
