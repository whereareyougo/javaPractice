package factoryCode;

public class BulePen extends Pen {

	@Override
	public PenCore getPenCore() {
		return new BulePenCore();
	}

}
