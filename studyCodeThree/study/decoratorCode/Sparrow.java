package decoratorCode;

public class Sparrow extends Bird {
	/**
	 * ��ֻ���ܷ��� 100��
	 */
	private final int DISTANCE = 100;
	@Override
	public int fly() {
		return DISTANCE;
	}

}
