package factoryCode;

public class Application {

	public static void main(String[] args) {
		PenCore penCore;
		Pen pen = new RedPen();
		penCore = pen.getPenCore();
		penCore.writeWord("�ż���!");
		pen = new BulePen();
		penCore = pen.getPenCore();
		penCore.writeWord("�����");
		pen = new WhitePen();
		pen.getPenCore();
		penCore.writeWord("����İ�");
	}

}
