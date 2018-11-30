package ConstructCode.Component.TransparentMode;

public class ReSearchComposite extends CompanyComponent {
	
	
	public ReSearchComposite(String name) {
		this.name = name;
	}

	@Override
	void addPerson(CompanyComponent companyComponent) {
		personList.add(companyComponent);
	}

	@Override
	void removePerson(CompanyComponent companyComponent) {
		// TODO Auto-generated method stub

	}

	@Override
	CompanyComponent getChildren(String curId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	CompanyComponent getParent(String curId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void operation() {
		for (CompanyComponent companyComponent : personList) {
			System.out.println(companyComponent.name);
			companyComponent.operation();
		}
	}

}
