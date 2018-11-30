package factoryCode;

public class WhitePen extends Pen {

	@Override
	public PenCore getPenCore() {
		return new WhitePenCore();
	}

}
