package observerCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 查找工作中心
 * @author hello
 *
 */
public class SeekJobCenter implements Subject {
	String mess;//消息
	boolean changed;
	List<Observer> personList;
	
	public SeekJobCenter() {
		mess = "";
		changed = false;
		personList = new ArrayList<Observer>();
	}
	@Override
	public void addObserver(Observer observer) {
		if (!personList.contains(observer)) {
			personList.add(observer);
		}

	}

	@Override
	public void deleteObserver(Observer observer) {
		if (personList.contains(observer)) {
			personList.remove(observer);
		}
	}

	@Override
	public void notifyObserver() {
		if (changed) {
			for (int i = 0; i < personList.size(); i++) {
				Observer observer = personList.get(i);
				observer.hearTelPhone(mess);
			}
			changed = false;
		}

	}

	@Override
	public void giveNewMess(String str) {
		if (mess.equals(str)) {
			changed = false;
		}else{
			changed = true;
		}
		
	}

}
