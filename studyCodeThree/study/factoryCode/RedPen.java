package factoryCode;

public class RedPen extends Pen {

	@Override
	public PenCore getPenCore() {
		return new RedPenCore();
	}

}
