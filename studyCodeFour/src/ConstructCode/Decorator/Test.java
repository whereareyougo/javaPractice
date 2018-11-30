package ConstructCode.Decorator;

public class Test {

	public static void main(String[] args) {
		BreadAbstract breadAbstract = new NormalBread();
		BreadAbstract breadAbstract2 = new RedBread(breadAbstract);
		breadAbstract2.process();
	}

}
