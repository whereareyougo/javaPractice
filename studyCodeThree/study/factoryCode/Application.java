package factoryCode;

public class Application {

	public static void main(String[] args) {
		PenCore penCore;
		Pen pen = new RedPen();
		penCore = pen.getPenCore();
		penCore.writeWord("放假啦!");
		pen = new BulePen();
		penCore = pen.getPenCore();
		penCore.writeWord("真的吗？");
		pen = new WhitePen();
		pen.getPenCore();
		penCore.writeWord("是真的啊");
	}

}
