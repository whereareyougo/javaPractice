package factoryCode;

public class BulePenCore extends PenCore {
	
	public BulePenCore() {
		color = "À¶É«";
	}
	@Override
	public void writeWord(String s) {
		System.out.println("Ð´³ö"+color+"µÄ×Ö:"+s);
	}

}
