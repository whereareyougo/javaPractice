package CreateMode.Prototype;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("¹þ¹þ");
		Person person2 = person1.clone();
		System.out.println(person1 == person2);
		System.out.println(person1.getAge() == person2.getAge());
		System.out.println(person1.getName());
		System.out.println(person2.getName());
	}

}
