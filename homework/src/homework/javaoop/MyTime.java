package homework.javaoop;

public class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void display() {
		System.out.println(hour + ":" + minute + ":" + second);
	}

	public void addSecond(int sec) {
		second += sec;
		while (second >= 60) {
			second -= 60;
			addMinute(1);
		}
	}

	public void addMinute(int min) {
		minute += min;
		while (minute >= 60) {
			minute -= 60;
			addHour(1);
		}
	}

	public void addHour(int hou) {
		hour += hou;
		while (hour >= 24) {
			hour -= 24;
		}
	}
}
