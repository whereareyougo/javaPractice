package ConstructCode.Component.SafeMode;

public class SecretaryLeaf extends CompanyComponent {
	String name;
	public SecretaryLeaf(String name) {
		this.name = name;
	}
	@Override
	void operation() {
		System.out.println("Œ“ «"+this.name);
	}

}
