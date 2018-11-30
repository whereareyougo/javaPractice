package handlerCode;

import java.util.ArrayList;
import java.util.List;

public class Beijing implements Handler {
	
	private Handler handler;
	private List<String> numberList;
	
	public Beijing() {
		numberList = new ArrayList<>();
		numberList.add("1");
		numberList.add("2");
		numberList.add("3");
	}

	@Override
	public void handleRequest(String number) {
		if (numberList.contains(number)) {
			System.out.println("此人在北京");
		}else{
			System.out.println("此人不在北京");
			if (handler != null) {
				handler.handleRequest(number);
			}
		}
	}

	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}

}
