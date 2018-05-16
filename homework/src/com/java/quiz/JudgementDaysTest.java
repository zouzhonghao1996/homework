package com.java.quiz;

import java.util.Scanner;

public class JudgementDaysTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入年 月 日：");
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			int day = scanner.nextInt();
			JudgementDays howday = new JudgementDays();
			if (howday.judge(year, month, day)) {
				howday.dayOfTheYear(year, month, day);
			} else {
				System.out.println("你的输入有误请重新输入");
			}
		}
	}

}
