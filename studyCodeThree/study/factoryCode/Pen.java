package factoryCode;
/**
 * ��
 * @author hello
 *
 */
public abstract class Pen {
	public Pen() {
		System.out.println("����һֻ��д��"+getPenCore().color+"�ֵı�");
	}
	
	public abstract PenCore getPenCore();
}
