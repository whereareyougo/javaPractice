package ConstructCode.Component.TransparentMode;

public class Test {

	public static void main(String[] args) {
		CompanyComponent s1,a1,a2,a3,a4;
		s1 = new ReSearchComposite("��������");
		a1 = new SecretaryLeaf("��������");
		a2 = new ReSearchComposite("�����з�һ��");
		a3 = new ReSearchComposite("�����з�����");
		a4 = new ReSearchComposite("�����з��鳤");
		s1.addPerson(a1);
		s1.addPerson(a4);
		a4.addPerson(a2);
		a4.addPerson(a3);
		s1.operation();
		a1.addPerson(null);
	}

}
