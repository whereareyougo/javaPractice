package factoryCode;
/**
 * ��ɫ��о
 * @author hello
 *
 */
public class RedPenCore extends PenCore {
	
	public RedPenCore() {
		color = "��ɫ";
	}
	
	@Override
	public void writeWord(String s) {
		System.out.println("д��"+color+"����:"+s);
	}

}
