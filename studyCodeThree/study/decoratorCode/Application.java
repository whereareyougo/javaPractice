package decoratorCode;

public class Application {

	public void needBird(Bird bird) {
		int flyDistance = bird.fly();
		System.out.println("这只鸟能飞行" + flyDistance + "米");
	}

	public static void main(String args[]) {
//		Application client = new Application();
//		Bird sparrow = new Sparrow();
//		Bird sparrowDecorator1 = new DecoratorSparrow(sparrow);
//		Bird sparrowDecorator2 = new DecoratorSparrow(sparrowDecorator1);
//		client.needBird(sparrowDecorator1);
//		client.needBird(sparrowDecorator2);
		ReadWord readWord = new ReadEnglishWord();
		DecoratorReadWord one = new WordAndChinese(readWord);
		DecoratorReadWord two = new WordAndChineseAndJuzi(one);
		System.out.println(one.readWord() + "=======" + two.readWord());
	}

}
