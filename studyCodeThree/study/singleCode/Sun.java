package singleCode;
/**
 * 单件模式(全局只有一个实例)
 * @author hello
 *
 */
public class Sun {
	private static Sun sun;
	
	private Sun(){
		
	}
	
	public static Sun getInstance(){
		if (sun == null) {
			synchronized (Sun.class) {
				if (sun == null) {
					sun = new Sun();
				}
			}
		}
		return sun;
	}
	
	
	
}
