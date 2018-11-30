package decoratorCode;

public class WordAndChineseAndJuzi extends DecoratorReadWord {

	public WordAndChineseAndJuzi(ReadWord readWord) {
		super(readWord);
	}

	@Override
	public String readWord() {
		// TODO Auto-generated method stub
		return super.readWord() + juzi();
	}
	
	public String juzi(){
		return "hello,everyBody!";
	}
	
}
