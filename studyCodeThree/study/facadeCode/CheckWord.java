package facadeCode;
/**
 * ¼ì²é×Ö·û´®×ÖÊý
 * @author hello
 *
 */
public class CheckWord {
	private String adverString;
	private final int baseCount = 10;
	public CheckWord(String adverString) {
		super();
		this.adverString = adverString;
	}
	
	public int checkWordCount(){
		return this.adverString.length() + baseCount;
	}
}
