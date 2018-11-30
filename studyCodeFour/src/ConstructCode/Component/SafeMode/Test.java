package ConstructCode.Component.SafeMode;

public class Test {

	public static void main(String[] args) {
		CompanyComponent se1,se2;
		ReSearchComposite s1,a1,a2,a3;
		se1 = new SecretaryLeaf("秘书1");
		se2 = new SecretaryLeaf("秘书2");
		s1 = new ReSearchComposite("总经理");
		a1 = new ReSearchComposite("研发组长");
		a2 = new ReSearchComposite("研发一号");
		a3 = new ReSearchComposite("研发二号");
		s1.addPerson(se1);
		s1.addPerson(se2);
		s1.addPerson(a1);
		a1.addPerson(a2);
		a1.addPerson(a3);
		s1.operation();

	}

}
