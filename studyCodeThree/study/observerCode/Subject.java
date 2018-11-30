package observerCode;

/**
 * 主题
 * @author hello
 *
 */
public interface Subject {
	/**
	 * 添加观察者
	 * @param observer
	 */
	public void addObserver(Observer observer);
	
	/**
	 * 删除观察者
	 * @param observer
	 */
	public void deleteObserver(Observer observer);
	
	/**
	 * 通知观察者
	 */
	public void notifyObserver();
	
	/**
	 * 新消息
	 * @param str
	 */
	public void giveNewMess(String str);
}
