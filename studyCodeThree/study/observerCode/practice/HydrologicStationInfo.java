package observerCode.practice;

import java.util.ArrayList;
import java.util.List;

public class HydrologicStationInfo implements HydrologicStation {
	/**
	 * π€≤Ï’ﬂ¥Ê¥¢
	 */
	 private List<HeadQuarters> list = new ArrayList<>();
	
	@Override
	public void addHeadQuarters(HeadQuarters headQuarters) {
		if (!list.contains(headQuarters)) {
			list.add(headQuarters);
		}
	}

	@Override
	public void deleteHeadQuarters(HeadQuarters headQuarters) {
		if (list.contains(headQuarters)) {
			list.remove(headQuarters);
		}
	}

	@Override
	public void sendMsg(String msg) {
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				list.get(i).getHydrologicMsg(msg);
			}
		}
	}

}
