package com.java.suanshu42;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double high = 100;
		int time = 0;
		double mile = 0;
		while (true) {
			time++;
			double temp = high;
			mile += high;
			high -= high;
			if (time == 10) {
				System.out.println(mile);
			}
			high += temp / 2;
			mile += high;
			if (time == 10) {
				System.out.println(high);
				break;
			}

		}
	}

}
