package Behavior.iterator;

public class Test {

	public static void main(String[] args) {
		ConcreteList<String> list = new ConcreteList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
