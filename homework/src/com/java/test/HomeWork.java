package com.java.test;
import java.util.Scanner;
public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scanner=new Scanner(System.in);
        System.out.println("输入年份：");
       int year=scanner.nextInt();
        if (year%400==0) {
		System.out.println("这是一个闰年！");
		}else if(year%4==0&&year!=0){
			System.out.println("这是一个闰年！");
		}else {
			System.out.println("这不是一个闰年！");
	}*/
	// 输出乘法表
		/*
		 * for (int i = 1; i < 10; i++) { System.out.println(); for (int j = 1; j <= i;
		 * j++) { System.out.print(j+"*"+i+"="+i*j+" "); } }
		 */
		// 输出直角三角形
		/*
		 * Scanner scanner=new Scanner(System.in); System.out.println("请输入三角形的行数："); int
		 * line=scanner.nextInt(); for (int i = 1; i <=line; i++) {
		 * System.out.println(); for (int x = line; x>i; x--) { System.out.print(" "); }
		 * for (int j = 0; j < i; j++) { System.out.print("*"); } }
		 */
		// 直角三角形
		/*
		 * 等边三角形 Scanner scanner=new Scanner(System.in);
		 * System.out.println("请输入三角形的行数："); int line=scanner.nextInt(); for (int i = 1;
		 * i <=line; i++) { System.out.println(); //左边空格 for (int x = line; x>i; x--) {
		 * System.out.print(" "); } //左边的直角三角形 for (int j = 0; j < i; j++) {
		 * System.out.print("*"); } //右边的小直角三角形 for (int y = 0; y < i-1; y++) {
		 * System.out.print("*"); } }
		 */

		/*
		 * Scanner scanner=new Scanner(System.in); System.out.println("请输入一个数："); int
		 * number=scanner.nextInt(); int result=1; for (int i = 1; i <= number; i++) {
		 * result=i*result; } System.out.println(number+"的阶层是："+result);
		 */

		/*
		 * Scanner scanner=new Scanner(System.in); System.out.println("输入底数："); int
		 * down=scanner.nextInt(); System.out.println("输入冥数："); int
		 * up=scanner.nextInt(); int result=1; for (int i = 0; i < up; i++) {
		 * result=result*down; } System.out.println(down+"的"+up+"次方是"+result);
		 */
/*
		double money = 0;
		int day = 0;
		while (money <= 100) {
			day = day + 1;
			if (day % 5 == 0) {
				money = money - 6;
				System.out.println("第" + day + "天花去6元，还剩" + money + "元！");
			}
			money = money + 2.5;
		}
		System.out.println("要经过" + day + "天的储存才能存上100元！");*/

		/*System.out.println("1~100之间的偶数为：");
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			if (i % 10 == 0) {
				System.out.println();
			}
			i = i + 1;
		}*/
	}

}
