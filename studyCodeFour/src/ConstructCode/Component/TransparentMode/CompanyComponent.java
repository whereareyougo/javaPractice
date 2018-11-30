package ConstructCode.Component.TransparentMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义抽象类，将树枝和叶子节点共有部分提取出来
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
