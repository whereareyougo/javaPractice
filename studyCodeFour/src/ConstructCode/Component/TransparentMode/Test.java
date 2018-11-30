package ConstructCode.Component.TransparentMode;

public class Test {

	public static void main(String[] args) {
		CompanyComponent s1,a1,a2,a3,a4;
		s1 = new ReSearchComposite("我是主管");
		a1 = new SecretaryLeaf("我是秘书");
		a2 = new ReSearchComposite("我是研发一号");
		a3 = new ReSearchComposite("我是研发二号");
		a4 = new ReSearchComposite("我是研发组长");
		s1.addPerson(a1);
		s1.addPerson(a4);
		a4.addPerson(a2);
		a4.addPerson(a3);
		s1.operation();
		a1.addPerson(null);
	}

}
