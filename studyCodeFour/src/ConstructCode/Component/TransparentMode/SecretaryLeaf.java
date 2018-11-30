package ConstructCode.Component.TransparentMode;

public class SecretaryLeaf extends CompanyComponent {
	
	public SecretaryLeaf(String name) {
		this.name = name;
	}

	@Override
	void addPerson(CompanyComponent companyComponent) {
		System.out.println("����Ҷ�ӽڵ㣬û����һ��");
	}

	@Override
	void removePerson(CompanyComponent companyComponent) {
		System.out.println("����Ҷ�ӽڵ㣬��֧���Ƴ���һ��");
	}

	@Override
	CompanyComponent getChildren(String curId) {
		System.out.println("����Ҷ�ӽڵ㣬û������");
		return null;
	}

	@Override
	CompanyComponent getParent(String curId) {
		
		return null;
	}

	@Override
	void operation() {
		System.out.println("����һ�����ֽ�"+this.name);
	}
	
}
