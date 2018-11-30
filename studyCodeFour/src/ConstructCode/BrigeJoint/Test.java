package ConstructCode.BrigeJoint;

public class Test {

	public static void main(String[] args) {
		Color red = new RedColor();
		Shape shape = new SquareShape();
		shape.setColor(red);
		shape.draw();
	}

}
