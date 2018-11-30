package factoryCode;

public class WhitePenCore extends PenCore {
	
	public WhitePenCore() {
		color = "°×É«";
	}
	@Override
	public void writeWord(String s) {
		System.out.println("Ð´³ö"+color+"µÄ×Ö"+s);
	}

}
