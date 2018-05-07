package com.java.demo;

import java.util.Scanner;

public class YYFJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int input = scanner.nextInt();	
		int i=2;
		while(input!=i) {
			if(input%i==0) {
				input/=i;
				System.out.print(i+"*");
			}else {
				i++;
			}
		}
		System.out.print(i);
	}

}
