package CreateMode.Builder;

public class Test {

	public static void main(String[] args) {
		PersonDirector personDirector = new PersonDirector();
		Person person = personDirector.createPerson(new PersonBuilderImpl());
		System.out.println(person.getHead());
		System.out.println(person.getBoby());
		System.out.println(person.getFoot());
	}

}
