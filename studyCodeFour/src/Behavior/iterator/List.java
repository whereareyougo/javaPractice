package Behavior.iterator;
/**
 * ����һ���������������ӿ�
 * @author hello
 *
 */
public interface List<E>{
	public void add(E e);
	public E get(int index);
	public Iterator<E> iterator();
}
