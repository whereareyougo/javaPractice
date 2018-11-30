package CreateMode.AbstractFactory;
/**
 * 创建人类工厂,这是工厂方法模式,若是在增加抽象类和具体的类，在这个接口中增加生产新增的这个类的方法，那么就变成了抽象工厂方法
 * @author hello
 *
 */
public interface CreateHumanFactory {
	HumanAbstract createHuman();
}
