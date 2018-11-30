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
			System.out.println("�����ڳɶ�");
		}else{
			System.out.println("���˲��ڳɶ�");
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
