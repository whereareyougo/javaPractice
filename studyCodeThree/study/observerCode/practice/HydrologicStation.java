package observerCode.practice;
/**
 * 水文站
 * @author hello
 *
 */
public interface HydrologicStation {
	/**
	 * 增加观察者
	 * @param headQuarters
	 */
	public void addHeadQuarters(HeadQuarters headQuarters);
	/**
	 * 移除观察者
	 * @param headQuarters
	 */
	public void deleteHeadQuarters(HeadQuarters headQuarters);
	/**
	 * 发送消息者
	 * @param msg
	 */
	public void sendMsg(String msg);
}
