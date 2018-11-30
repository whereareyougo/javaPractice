package decoratorCode;

public class Sparrow extends Bird {
	/**
	 * 这只鸟能飞行 100米
	 */
	private final int DISTANCE = 100;
	@Override
	public int fly() {
		return DISTANCE;
	}

}
