package facadeCode;
/**
 * 根据字数计算费用
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
		System.out.println("广告费用为"+ checkWord.checkWordCount()*baseFee);
	}
}
