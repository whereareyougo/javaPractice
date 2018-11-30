package decoratorCode;
/**
 * 具体装饰类
 * @author hello
 *
 */
public class DecoratorSparrow extends DecoratirBird {
	public final int DISTANCE = 50;
	
	
	public DecoratorSparrow(Bird bird) {
		super(bird);
	}
	
	@Override
	public int fly() {
		return bird.fly() + eleFly();
	}
	
	public int eleFly(){
		return DISTANCE;
	}

}
