package factoryCode;

public class WhitePenCore extends PenCore {
	
	public WhitePenCore() {
		color = "��ɫ";
	}
	@Override
	public void writeWord(String s) {
		System.out.println("д��"+color+"����"+s);
	}

}
