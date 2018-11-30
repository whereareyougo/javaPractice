package CreateMode.Builder;
/**
 * ������
 * @author hello
 *
 */
public class PersonDirector {
	public Person createPerson(PersonBuilderImpl personBuilderImpl){
		personBuilderImpl.createHead();
		personBuilderImpl.createBody();
		personBuilderImpl.createFoot();
		return personBuilderImpl.createPerson();
	};
}
