package Behavior.iterator;
/**
 * 定义一个迭代器的容器接口
 * @author hello
 *
 */
public interface List<E>{
	public void add(E e);
	public E get(int index);
	public Iterator<E> iterator();
}
