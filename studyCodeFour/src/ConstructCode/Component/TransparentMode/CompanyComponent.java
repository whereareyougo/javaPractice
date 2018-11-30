package ConstructCode.Component.TransparentMode;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������࣬����֦��Ҷ�ӽڵ㹲�в�����ȡ����
 * @author hello
 *
 */
public abstract class CompanyComponent {
	List<CompanyComponent> personList = new ArrayList<>();
	String name;
	abstract void addPerson(CompanyComponent companyComponent);
	abstract void removePerson(CompanyComponent companyComponent);
	abstract CompanyComponent getChildren(String curId);
	abstract CompanyComponent getParent(String curId);
	abstract void operation();
}
