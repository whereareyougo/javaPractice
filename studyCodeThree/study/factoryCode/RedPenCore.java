package factoryCode;
/**
 * 红色笔芯
 * @author hello
 *
 */
public class RedPenCore extends PenCore {
	
	public RedPenCore() {
		color = "红色";
	}
	
	@Override
	public void writeWord(String s) {
		System.out.println("写出"+color+"的字:"+s);
	}

}
