package studyCode;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

public class Test {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);

				int month = c.get(Calendar.MONTH);

				int date = c.get(Calendar.DATE);

				int hour = c.get(Calendar.HOUR_OF_DAY);

				int minute = c.get(Calendar.MINUTE);

				int second = c.get(Calendar.SECOND);

				System.out.println(year + "/" + month + "/" + date + " " +hour + ":" +minute + ":" + second);
				System.out.println(c.getTime());
				Date date2 = new Date();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				String firstday, lastday;
				c.add(Calendar.MONTH, 0);
				c.set(Calendar.DAY_OF_MONTH, 1);
				firstday = format.format(c.getTime());
				System.out.println(firstday);
				c = Calendar.getInstance();
				c.add(Calendar.MONTH, 1);
				c.set(Calendar.DAY_OF_MONTH, 0);
				lastday = format.format(c.getTime());
				System.out.println(lastday);
//	date2.getHours();
//	date2.getMinutes();
//	date2.getSeconds();
//	System.out.println(date2.toString());
	}

}
