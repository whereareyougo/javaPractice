package ConstructCode.Decorator;

public class NormalBread extends BreadAbstract {

	@Override
	void prepair() {
		System.out.println("正在准备制作面包的材料");

	}

	@Override
	void kneadFlour() {
		System.out.println("和面中......");

	}

	@Override
	void steamed() {
		System.out.println("开始蒸面包啦！");

	}

	@Override
	void process() {
		prepair();
		kneadFlour();
		steamed();

	}

}
