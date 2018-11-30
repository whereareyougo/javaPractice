package decoratorCode;

/**
 * 具体装饰类
 * @author hello
 *
 */
public class WordAndChinese extends DecoratorReadWord {

	public WordAndChinese(ReadWord readWord) {
		super(readWord);
	}

	@Override
	public String readWord() {
		// TODO Auto-generated method stub
		return super.readWord() + "==="+chinese();
	}
	
	public String chinese(){
		return "中文";
	}
	
}
