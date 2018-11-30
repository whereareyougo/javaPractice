package ConstructCode.Decorator;

public class NormalBread extends BreadAbstract {

	@Override
	void prepair() {
		System.out.println("����׼����������Ĳ���");

	}

	@Override
	void kneadFlour() {
		System.out.println("������......");

	}

	@Override
	void steamed() {
		System.out.println("��ʼ���������");

	}

	@Override
	void process() {
		prepair();
		kneadFlour();
		steamed();

	}

}
