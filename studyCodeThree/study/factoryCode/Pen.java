package factoryCode;
/**
 * 笔
 * @author hello
 *
 */
public abstract class Pen {
	public Pen() {
		System.out.println("制造一只能写出"+getPenCore().color+"字的笔");
	}
	
	public abstract PenCore getPenCore();
}
