package observerCode;

/**
 * ����
 * @author hello
 *
 */
public interface Subject {
	/**
	 * ��ӹ۲���
	 * @param observer
	 */
	public void addObserver(Observer observer);
	
	/**
	 * ɾ���۲���
	 * @param observer
	 */
	public void deleteObserver(Observer observer);
	
	/**
	 * ֪ͨ�۲���
	 */
	public void notifyObserver();
	
	/**
	 * ����Ϣ
	 * @param str
	 */
	public void giveNewMess(String str);
}
