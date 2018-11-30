package ConstructCode.Decorator;

public class RedBread extends BreadDecoratorAbstract {
	
	public RedBread(BreadAbstract breadAbstract) {
		super(breadAbstract);
	}
	
	void paint(){
		System.out.println("����һ����ɫ�����");
	}

	@Override
	void prepair() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void kneadFlour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void steamed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void process() {
		this.paint();
		super.process();
		
	}

}
