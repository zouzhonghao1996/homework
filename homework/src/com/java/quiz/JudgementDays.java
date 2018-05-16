package com.java.quiz;

public class JudgementDays {
	private int[] year = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
	private int[] year2 = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 };

	public boolean judge(int year, int month, int day) {
		if (year < 0 || month < 0 || month > 12) {
			return false;
		}

		if (year % 400 == 0 || (year % 4 == 0 && year != 0)) {
			switch (month) {
			case 1:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 2:
				if (day > 29 || day < 0) {
					return false;
				}
				break;
			case 3:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 4:
				if (day > 30 || day < 0) {
					return false;
				}
				break;
			case 5:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 6:
				if (day > 30 || day < 0) {
					return false;
				}
				break;
			case 7:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 8:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 9:
				if (day > 30 || day < 0) {
					return false;
				}
				break;
			case 10:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 11:
				if (day > 30 || day < 0) {
					return false;
				}
				break;
			case 12:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			}

		} else {

			switch (month) {
			case 1:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 2:
				if (day > 28 || day < 0) {
					return false;
				}
				break;
			case 3:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 4:
				if (day > 30 || day < 0) {
					return false;
				}
				break;
			case 5:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 6:
				if (day > 30 || day < 0) {
					return false;
				}
				break;
			case 7:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 8:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 9:
				if (day > 30 || day < 0) {
					return false;
				}
				break;
			case 10:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			case 11:
				if (day > 30 || day < 0) {
					return false;
				}
				break;
			case 12:
				if (day > 31 || day < 0) {
					return false;
				}
				break;
			}

		

		}
		return true;

	}

	public void dayOfTheYear(int year, int month, int day) {
		if (year % 400 == 0 || (year % 4 == 0 && year != 0)) {
			int sum = 0;
			sum += day;
			for (int i = 0; i < month - 1; i++) {
				sum += this.year2[i];
			}
			System.out.println("这是" + year + "年的第" + sum + "天");
		} else {
			int sum = 0;
			sum += day;
			for (int i = 0; i < month - 1; i++) {
				sum += this.year[i];
			}
			System.out.println("这是" + year + "年的第" + sum + "天");
		}

	}
}
