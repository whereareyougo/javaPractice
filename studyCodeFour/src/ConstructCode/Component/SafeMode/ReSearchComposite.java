package ConstructCode.Component.SafeMode;

import java.util.ArrayList;
import java.util.List;

/**
 * ������������ʵ���Լ�����Ҫ�ķ���
 * @author hello
 *
 */
public class ReSearchComposite extends CompanyComponent {
	String name;
	List<CompanyComponent> perList = new ArrayList<>();
	public ReSearchComposite(String name) {
		this.name = name;
	}
	@Override
	void operation() {
		System.out.println("����"+this.name);
		if (perList.size() > 0) {
			for (CompanyComponent companyComponent : perList) {
				companyComponent.operation();
			}
		}

	}
	
	public void addPerson(CompanyComponent companyComponent){
		perList.add(companyComponent);
	}
	
}
