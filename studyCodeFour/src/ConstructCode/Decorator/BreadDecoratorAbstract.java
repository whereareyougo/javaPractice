package ConstructCode.Decorator;

public abstract class BreadDecoratorAbstract extends BreadAbstract {
	BreadAbstract breadAbstract;
	public BreadDecoratorAbstract(BreadAbstract breadAbstract) {
		this.breadAbstract = breadAbstract;
	}
	@Override
	void prepair() {
		this.breadAbstract.prepair();

	}

	@Override
	void kneadFlour() {
		this.breadAbstract.kneadFlour();
	}

	@Override
	void steamed() {
		this.breadAbstract.steamed();

	}

	@Override
	void process() {
		prepair();
		kneadFlour();
		steamed();

	}

}
