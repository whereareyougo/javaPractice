package factoryCode;

public class BulePenCore extends PenCore {
	
	public BulePenCore() {
		color = "��ɫ";
	}
	@Override
	public void writeWord(String s) {
		System.out.println("д��"+color+"����:"+s);
	}

}
