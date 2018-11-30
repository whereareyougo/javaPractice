package decoratorCode;

import java.util.ArrayList;
import java.util.List;
/**
 * 具体组件
 * @author hello
 *
 */
public class ReadEnglishWord extends ReadWord {
	
	
	public ReadEnglishWord() {
	}


	@Override
	public String readWord() {
		//这里先进行省略
		return "hello";
	}

}
