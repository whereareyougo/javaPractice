package ConstructCode.Component.SafeMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 在容器构件中实现自己所需要的方法
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
		System.out.println("我是"+this.name);
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
