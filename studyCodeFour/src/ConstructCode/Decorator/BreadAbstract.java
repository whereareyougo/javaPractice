package ConstructCode.Decorator;
/**
 * ����ĳ������ӿ�,��һ����װ���ߵĳ������ӿڣ���װ��Ϊ
 * 1���Ž�ģʽ����˵�ķ��룬��ʵ��ָ���ṹ��ʵ�ַ��루���ṹ��ʵ���п��ܷ����仯ʱ����������������Ե���Ϊ���з��룻
 * ��װ����ֻ�ǶԻ������Ե���Ϊ���з�ճɶ������ࡣ
 * 2���Ž��е���Ϊ�Ǻ������Ϊ����Ϊ�˴�֮���޹�����
 * ��װ����ģʽ�е���Ϊ���пɵ����ԣ�����ֳ����Ľ����һ�����壬һ��������Ϊ��Ϻ��һ�������
 * @author hello
 *
 */
public abstract class BreadAbstract {
	abstract void prepair();
	abstract void kneadFlour();
	abstract void steamed();
	abstract void process();
}
