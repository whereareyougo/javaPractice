package observerCode.practice;

public class Application {

	public static void main(String[] args) {
		HydrologicStationInfo hydrologicStationInfo = new HydrologicStationInfo();
		hydrologicStationInfo.sendMsg("ˮ��100");
		HeadQuartersOne h1 = new HeadQuartersOne();
		HeadQuartersOne h2 = new HeadQuartersOne();
		HeadQuartersOne h3 = new HeadQuartersOne();
		hydrologicStationInfo.addHeadQuarters(h1);
		hydrologicStationInfo.addHeadQuarters(h2);
		hydrologicStationInfo.addHeadQuarters(h3);
		hydrologicStationInfo.sendMsg("������ô��");

	}

}
