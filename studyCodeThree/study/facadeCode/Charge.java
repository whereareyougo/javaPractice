package facadeCode;
/**
 * ���������������
 * @author hello
 *
 */
public class Charge {
	private final int baseFee = 10;
	private CheckWord checkWord;
	public Charge(CheckWord checkWord) {
		super();
		this.checkWord = checkWord;
	}
	
	public void computingFee(){
		System.out.println("������Ϊ"+ checkWord.checkWordCount()*baseFee);
	}
}
