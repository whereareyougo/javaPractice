package decoratorCode;
/**
 * ×°ÊÎÀà
 * @author hello
 *
 */
public abstract class DecoratirBird extends Bird{
	Bird bird;

	public DecoratirBird(Bird bird) {
		super();
		this.bird = bird;
	}
	
	public DecoratirBird() {
	}
	
}
