package Behavior.iterator;
/**
 * 定义一个迭代器
 * @author hello
 *
 */
public interface Iterator<E> {
	/**
	 * 判断是否还有下一个
	 * @return
	 */
	boolean hasNext();
	/**
	 * 取下一个对象
	 * @return
	 */
	E next();
	/**
	 * 移除当前对象
	 * @param index
	 */
	void remove(int index);
}
