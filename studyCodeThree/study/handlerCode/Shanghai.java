package handlerCode;

import java.util.ArrayList;
import java.util.List;

public class Shanghai implements Handler {
	
	private Handler handler;
	private List<String> numberList;
	
	public Shanghai() {
		numberList = new ArrayList<>();
		numberList.add("4");
		numberList.add("5");
		numberList.add("6");
	}

	@Override
	public void handleRequest(String number) {
		if (numberList.contains(number)) {
			System.out.println("�������Ϻ�");
		}else{
			System.out.println("���˲����Ϻ�");
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
