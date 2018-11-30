package decoratorCode;

public abstract class DecoratorReadWord extends ReadWord {
	private ReadWord readWord;
	
	public DecoratorReadWord(ReadWord readWord) {
		this.readWord = readWord;
	}

	@Override
	public String readWord() {
		return readWord.readWord();
	}

}
