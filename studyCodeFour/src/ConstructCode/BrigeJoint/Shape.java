package ConstructCode.BrigeJoint;
/**
 * ÐÎ×´
 * @author hello
 *
 */
public abstract class Shape {
	Color color;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	abstract void draw();
}
