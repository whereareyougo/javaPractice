package Behavior.iterator;

import java.lang.reflect.Array;

public class ConcreteList<E> implements List<E> {
	
	private final Object[] OBJECT_ARRAY = {};
	private transient Object[] empty_array;
	private int size ;
	public ConcreteList() {
		this.size = 0;
	}
	@Override
	public void add(E e) {
		if (empty_array == null) 
			empty_array = new Object[10];
		empty_array[size++] = e;
	}

	@Override
	public E get(int index) {
		if (index > size)
			throw new IndexOutOfBoundsException("这里是数组越界");
		return (E)empty_array[index];
	}

	@Override
	public Iterator<E> iterator() {
		return new ConcreteIterator();
	}
	
	public class ConcreteIterator implements Iterator<E>{
		int cursor = 0;//当前位置
		int lastIndex;//最后一个位置
		@Override
		public boolean hasNext() {
			return cursor != size;
		}

		@Override
		public E next() {
			return (E)empty_array[cursor++];
		}

		@Override
		public void remove(int index) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
