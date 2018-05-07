package com.java.demo;

import java.util.Scanner;

public class Demo {
	public static void shushu(int x) {
		for (int i = 1; i <= x; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int tmp = scanner.nextInt();
		shushu(tmp);
	}

}
