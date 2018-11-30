package CreateMode.Builder;
/**
 * 建造人物接口
 * @author hello
 *
 */
public interface PersonBuilder {
	public void createHead();
	public void createBody();
	public void createFoot();
	public Person createPerson();
}
