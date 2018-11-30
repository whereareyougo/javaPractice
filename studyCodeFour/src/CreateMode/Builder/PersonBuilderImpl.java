package CreateMode.Builder;

public class PersonBuilderImpl implements PersonBuilder {
	private Person person;
	
	public PersonBuilderImpl() {
		person =  new Person();
	}
	@Override
	public void createHead() {
		person.setHead("这是朱哥的头");
	}

	@Override
	public void createBody() {
		person.setBoby("这是朱哥的身体");
	}

	@Override
	public void createFoot() {
		person.setFoot("这是朱哥的脚");
	}
	
	@Override
	public Person createPerson(){
		return person;
	}

}
