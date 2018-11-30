package facadeCode;
/**
 * 设计广告模板
 * @author hello
 *
 */
public class TypeSeting {
	private String adverString;

	public TypeSeting(String adverString) {
		super();
		this.adverString = adverString;
	}
	
	public void setType(){
		System.out.println("========广告模板========");
		System.out.println("========"+adverString+"========");
		System.out.println("========广告模板========");
		System.out.println("========广告模板========");
	}
}
