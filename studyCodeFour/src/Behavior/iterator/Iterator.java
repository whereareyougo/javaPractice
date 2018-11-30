package Behavior.iterator;
/**
 * ����һ��������
 * @author hello
 *
 */
public interface Iterator<E> {
	/**
	 * �ж��Ƿ�����һ��
	 * @return
	 */
	boolean hasNext();
	/**
	 * ȡ��һ������
	 * @return
	 */
	E next();
	/**
	 * �Ƴ���ǰ����
	 * @param index
	 */
	void remove(int index);
}
