package CreateMode.Builder;

public class PersonBuilderImpl implements PersonBuilder {
	private Person person;
	
	public PersonBuilderImpl() {
		person =  new Person();
	}
	@Override
	public void createHead() {
		person.setHead("��������ͷ");
	}

	@Override
	public void createBody() {
		person.setBoby("������������");
	}

	@Override
	public void createFoot() {
		person.setFoot("�������Ľ�");
	}
	
	@Override
	public Person createPerson(){
		return person;
	}

}
