package observerCode.practice;
/**
 * ˮ��վ
 * @author hello
 *
 */
public interface HydrologicStation {
	/**
	 * ���ӹ۲���
	 * @param headQuarters
	 */
	public void addHeadQuarters(HeadQuarters headQuarters);
	/**
	 * �Ƴ��۲���
	 * @param headQuarters
	 */
	public void deleteHeadQuarters(HeadQuarters headQuarters);
	/**
	 * ������Ϣ��
	 * @param msg
	 */
	public void sendMsg(String msg);
}
