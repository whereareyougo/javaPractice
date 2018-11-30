package ConstructCode.Component.TransparentMode;

public class SecretaryLeaf extends CompanyComponent {
	
	public SecretaryLeaf(String name) {
		this.name = name;
	}

	@Override
	void addPerson(CompanyComponent companyComponent) {
		System.out.println("这是叶子节点，没有下一级");
	}

	@Override
	void removePerson(CompanyComponent companyComponent) {
		System.out.println("这是叶子节点，不支持移除下一级");
	}

	@Override
	CompanyComponent getChildren(String curId) {
		System.out.println("这是叶子节点，没有子类");
		return null;
	}

	@Override
	CompanyComponent getParent(String curId) {
		
		return null;
	}

	@Override
	void operation() {
		System.out.println("我是一个名字叫"+this.name);
	}
	
}
