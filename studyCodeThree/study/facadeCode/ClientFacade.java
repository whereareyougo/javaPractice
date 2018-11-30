package facadeCode;
/**
 * ����࣬��װ��ϵͳ
 * @author hello
 *
 */
public class ClientFacade {
	private String adverString;
	private CheckWord checkWord;
	private Charge charge;
	private TypeSeting typeSeting;
	public ClientFacade(String adverString) {
		super();
		this.adverString = adverString;
		this.checkWord = new CheckWord(adverString);
		this.charge = new Charge(checkWord);
		this.typeSeting = new TypeSeting(adverString);
	}
	
	public void doAdver(){
		checkWord.checkWordCount();
		charge.computingFee();
		typeSeting.setType();
	}
	
}
