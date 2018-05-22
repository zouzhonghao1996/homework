package homework.javaoopch14;

import java.util.Calendar;

public abstract class Person {
	public void meal() {
		/*
		 * Date date=new Date(); int hour= date.getHours();
		 */

		Calendar calender = Calendar.getInstance();
		int hour = calender.get(Calendar.HOUR);
		if (hour >= 7 && hour <= 8) {
			breakfast_Time();
		} else if (hour >= 11 && hour <= 13) {
			lunch_Time();
		} else if (hour >= 17 && hour <= 20) {
			dinner_Time();
		}
	}

	public abstract void breakfast_Time();

	public abstract void lunch_Time();

	public abstract void dinner_Time();
}
