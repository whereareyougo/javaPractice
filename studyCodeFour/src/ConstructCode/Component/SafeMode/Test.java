package ConstructCode.Component.SafeMode;

public class Test {

	public static void main(String[] args) {
		CompanyComponent se1,se2;
		ReSearchComposite s1,a1,a2,a3;
		se1 = new SecretaryLeaf("����1");
		se2 = new SecretaryLeaf("����2");
		s1 = new ReSearchComposite("�ܾ���");
		a1 = new ReSearchComposite("�з��鳤");
		a2 = new ReSearchComposite("�з�һ��");
		a3 = new ReSearchComposite("�з�����");
		s1.addPerson(se1);
		s1.addPerson(se2);
		s1.addPerson(a1);
		a1.addPerson(a2);
		a1.addPerson(a3);
		s1.operation();

	}

}
