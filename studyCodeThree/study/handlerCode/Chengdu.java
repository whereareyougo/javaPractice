package handlerCode;

import java.util.ArrayList;
import java.util.List;

public class Chengdu implements Handler {
	
	private Handler handler;
	private List<String> numberList;
	
	public Chengdu() {
		numberList = new ArrayList<>();
		numberList.add("7");
		numberList.add("8");
		numberList.add("9");
	}

	@Override
	public void handleRequest(String number) {
		if (numberList.contains(number)) {
			System.out.println("此人在成都");
		}else{
			System.out.println("此人不在成都");
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
