package ConstructCode.Decorator;
/**
 * 面包的抽象类或接口,是一个被装饰者的抽象类或接口，封装行为
 * 1。桥接模式中所说的分离，其实是指将结构与实现分离（当结构和实现有可能发生变化时）或属性与基于属性的行为进行分离；
 * 而装饰者只是对基于属性的行为进行封闭成独立的类。
 * 2。桥接中的行为是横向的行为，行为彼此之间无关联；
 * 而装饰者模式中的行为具有可叠加性，其表现出来的结果是一个整体，一个各个行为组合后的一个结果。
 * @author hello
 *
 */
public abstract class BreadAbstract {
	abstract void prepair();
	abstract void kneadFlour();
	abstract void steamed();
	abstract void process();
}
