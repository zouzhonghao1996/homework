package com.java.demo;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int input = scanner.nextInt();
	    char c=  (input>=60 ?( input>=90? 'A': 'B' ): 'C');
	    System.out.println(c);
	}

}
